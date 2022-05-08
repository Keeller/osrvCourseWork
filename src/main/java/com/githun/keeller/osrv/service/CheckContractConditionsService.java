package com.githun.keeller.osrv.service;

import com.githun.keeller.osrv.model.dto.ChangeOwnerResponseDto;
import com.githun.keeller.osrv.model.dto.CheckContractResponseDto;
import com.githun.keeller.osrv.model.dto.SensorDataDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.model.PictureTransfer;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.gas.DefaultGasProvider;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
@Log4j2
public class CheckContractConditionsService {

    @Qualifier("private-web3j")
    private final Web3j web3j;
    @Qualifier("private-credentials")
    private final Credentials credentials;
    @Value("${private-block-chain.contract-address}")
    private String contractAddress;

    public CheckContractResponseDto execCheck(SensorDataDto sensorDataDto) throws Exception {
        OffsetDateTime receiveDate=OffsetDateTime.now();
        PictureTransfer contract = PictureTransfer.load(contractAddress, web3j, credentials, new DefaultGasProvider());
        TransactionReceipt temperatureValue1 = contract.put("temperatureValue1", sensorDataDto.getTemperatureValue1())
                .send();
        log.info(temperatureValue1.getBlockHash());
        TransactionReceipt temperatureValue2 = contract.put("temperatureValue2", sensorDataDto.getTemperatureValue2())
                .send();
        log.info(temperatureValue2.getBlockHash());
        TransactionReceipt humidityValue1 = contract.put("humidityValue1", sensorDataDto.getHumidityValue1())
                .send();
        log.info(humidityValue1.getBlockHash());
        TransactionReceipt humidityValue2 = contract.put("humidityValue2", sensorDataDto.getHumidityValue2())
                .send();
        log.info(humidityValue2.getBlockHash());
        TransactionReceipt send = contract.CheckIsFailed().send();
        log.info(send.getBlockHash());
        Boolean checkResult = contract.isFailed().send();
        return CheckContractResponseDto.builder()
                .isFailed(checkResult)
                .receive(receiveDate)
                .hash(send.getBlockHash())
                .build()
                ;
    }

    public ChangeOwnerResponseDto changeOwner(String newOwner) throws Exception {
        OffsetDateTime receiveDate=OffsetDateTime.now();
        PictureTransfer contract = PictureTransfer.load(contractAddress, web3j, credentials, new DefaultGasProvider());
        var isFailed=contract.isFailed().send();
        if(isFailed){
            return ChangeOwnerResponseDto.builder()
                    .isChanged(false)
                    .offsetDateTime(receiveDate)
                    .build();
        }
        TransactionReceipt send = contract.setOwner(newOwner).send();
        log.info(send.getBlockHash());
        String owner = contract.owner().send();
        return ChangeOwnerResponseDto.builder()
                .newOwner(owner)
                .changeHash(send.getBlockHash())
                .offsetDateTime(receiveDate)
                .isChanged(true)
                .build();
    }

}
