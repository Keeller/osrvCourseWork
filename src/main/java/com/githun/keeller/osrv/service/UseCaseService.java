package com.githun.keeller.osrv.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.githun.keeller.osrv.model.dto.AuditDto;
import com.githun.keeller.osrv.model.dto.ChangeOwnerResponseDto;
import com.githun.keeller.osrv.model.dto.CheckContractResponseDto;
import com.githun.keeller.osrv.model.dto.SensorDataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UseCaseService {
    private final CheckContractConditionsService checkContractConditionsService;
    private final AuditBlockchainService auditBlockchainService;

    public CheckContractResponseDto processCheckContractHook(SensorDataDto sensorDataDto) throws Exception {
        var checkContractResponseDto = checkContractConditionsService.execCheck(sensorDataDto);
        Map<String, String> info = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        info.put("sensor info dto", objectMapper.writeValueAsString(sensorDataDto));
        info.put("failed status", String.valueOf(checkContractResponseDto.getIsFailed()));
        var auditDto = AuditDto.builder()
                .hash(checkContractResponseDto.getHash())
                .info(objectMapper.writeValueAsString(info))
                .build();
        auditBlockchainService.audit(auditDto);
        return checkContractResponseDto;
    }

    public ChangeOwnerResponseDto processChangeOwnerHook(String owner) throws Exception {
        var changeOwnerResponseDto = checkContractConditionsService.changeOwner(owner);
        var auditDto = AuditDto.builder()
                .hash(changeOwnerResponseDto.getChangeHash())
                .info(changeOwnerResponseDto.getNewOwner())
                .build();
        auditBlockchainService.audit(auditDto);
        return changeOwnerResponseDto;
    }
}
