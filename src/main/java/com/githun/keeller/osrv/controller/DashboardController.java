package com.githun.keeller.osrv.controller;

import com.githun.keeller.osrv.service.AuditBlockchainService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dashboard")
public class DashboardController {

    private final AuditBlockchainService auditBlockchainService;

    @GetMapping("/info")
    @SneakyThrows
    public Map<String, String> getDashboardInfo() {
        return auditBlockchainService.getDashboardInfo();
    }

}
