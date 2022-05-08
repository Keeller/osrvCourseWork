package com.githun.keeller.osrv.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorDataDto {
    private BigInteger temperatureValue1;
    private BigInteger temperatureValue2;
    private BigInteger humidityValue1;
    private BigInteger humidityValue2;
    private String dateTime;
}
