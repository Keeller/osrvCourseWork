package com.githun.keeller.osrv.controller;

import com.githun.keeller.osrv.model.dto.ChangeOwnerResponseDto;
import com.githun.keeller.osrv.model.dto.CheckContractResponseDto;
import com.githun.keeller.osrv.model.dto.SensorDataDto;
import com.githun.keeller.osrv.service.UseCaseService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hook")
public class WebHookController {

    private final UseCaseService useCaseService;

    @SneakyThrows
    @PostMapping("/process-sensor-data")
    @ResponseBody
    public CheckContractResponseDto processCheckContractHook(@RequestBody SensorDataDto sensorDataDto){
        return useCaseService.processCheckContractHook(sensorDataDto);
    }

    @SneakyThrows
    @PostMapping("/process-change-owner/{owner}")
    @ResponseBody
    public ChangeOwnerResponseDto processChangeOwnerHook(@PathVariable("owner") String owner){
        return useCaseService.processChangeOwnerHook(owner);
    }
}
