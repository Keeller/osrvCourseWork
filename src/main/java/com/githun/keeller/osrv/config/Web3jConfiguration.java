package com.githun.keeller.osrv.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.Wallet;
import org.web3j.crypto.WalletFile;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Web3jConfiguration {

    @Value("${private-block-chain.url}")
    private String privateUrl;
    @Value("${private-block-chain.path}")
    private String privatePath;
    @Value("${private-block-chain.password}")
    private String privatePassword;
    @Value("${private-block-chain.credstring}")
    private String privateCredString;
    @Value("${public-block-chain.url}")
    private String publicUrl;
    @Value("${public-block-chain.path}")
    private String publicPath;
    @Value("${public-block-chain.password}")
    private String publicPassword;
    @Value("${public-block-chain.credstring}")
    private String publicCredString;

    @Bean(name = "private-web3j")
    public Web3j web3j() {
        return Web3j.build(new HttpService(privateUrl));
    }

    @SneakyThrows
    @Bean(name = "private-credentials")
    public Credentials credentials() {
        return loadCredential(privatePassword, privateCredString);
    }

    @Bean(name = "public-web3j")
    public Web3j publicWeb3j() {
        return Web3j.build(new HttpService(publicUrl));
    }

    @SneakyThrows
    @Bean(name = "public-credentials")
    public Credentials publicCredentials() {
        return loadCredential(publicPassword, publicCredString);
    }

    /**
     * Абсолютно поехавший костыль в связи с шикарным патчем на швиндовс который сломал работу с файлами
     *
     * @param credString
     * @return
     */
    private Credentials loadCredential(String password, String credString) throws JsonProcessingException, CipherException {
        ObjectMapper objectMapper = new ObjectMapper();
        WalletFile walletFile = (WalletFile) objectMapper.readValue(credString, WalletFile.class);
        return Credentials.create(Wallet.decrypt(password, walletFile));
    }
}
