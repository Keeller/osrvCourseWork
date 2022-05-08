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
public class ChangeOwnerResponseDto {

    private Boolean isChanged;
    private OffsetDateTime offsetDateTime;
    private String newOwner;
    private String changeHash;
}
