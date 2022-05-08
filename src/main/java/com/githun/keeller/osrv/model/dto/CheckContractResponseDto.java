package com.githun.keeller.osrv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckContractResponseDto {

    private Boolean isFailed;
    private OffsetDateTime receive;
    private String hash;
}
