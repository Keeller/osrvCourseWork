package com.githun.keeller.osrv.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.model.AuditContract;
import org.web3j.model.PictureTransfer;
import org.web3j.protocol.Web3j;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class AdminService {
    @Qualifier("public-web3j")
    private final Web3j web3jPublic;
    @Qualifier("public-credentials")
    private final Credentials credentialsPublic;
    @Qualifier("private-web3j")
    private final Web3j web3jPrivate;
    @Qualifier("private-credentials")
    private final Credentials credentialsPrivate;

    public String deployPictureContract() throws Exception {
        PictureTransfer send = PictureTransfer.deploy(web3jPrivate, credentialsPrivate,
                new DefaultGasProvider()).send();
        return send.getContractAddress();
    }

    public String deployAuditContract() throws Exception {
        AuditContract send = AuditContract.deploy(web3jPublic, credentialsPublic, new DefaultGasProvider()).send();
        return send.getContractAddress();
    }

}
