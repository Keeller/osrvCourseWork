package com.githun.keeller.osrv.controller;

import com.githun.keeller.osrv.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    @SneakyThrows
    @GetMapping("/deploy/picture-contract")
    public String deployPictureContract() {
        return adminService.deployPictureContract();
    }

    @SneakyThrows
    @GetMapping("/deploy/audit-contract")
    public String deployAuditContract() {
        return adminService.deployAuditContract();
    }
}
