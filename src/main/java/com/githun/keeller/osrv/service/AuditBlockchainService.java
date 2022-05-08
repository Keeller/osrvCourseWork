package com.githun.keeller.osrv.service;

import com.githun.keeller.osrv.model.dto.AuditDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.model.AuditContract;
import org.web3j.protocol.Web3j;
import org.web3j.tx.gas.DefaultGasProvider;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuditBlockchainService {

    @Qualifier("public-web3j")
    private final Web3j web3j;
    @Qualifier("public-credentials")
    private final Credentials credentials;
    @Value("${public-block-chain.contract-address}")
    private String contractAddress;

    public void audit(AuditDto auditDto) throws Exception {
        AuditContract contract = AuditContract.load(contractAddress, web3j, credentials, new DefaultGasProvider());
        contract.put(auditDto.getHash(),auditDto.getInfo()).send();
    }

    public Map<String,String> getDashboardInfo() throws Exception {
        AuditContract contract = AuditContract.load(contractAddress, web3j, credentials, new DefaultGasProvider());
        Map<String,String> result=new HashMap<>();
        BigInteger keysLength = contract.keyLength().send();
        for(BigInteger i=BigInteger.ZERO;i.compareTo(keysLength)<0;i=i.add(BigInteger.ONE)){
            String key = contract.keys(i).send();
            String value = contract.get(key).send();
            result.put(key,value);
        }
        return result;
    }
}
