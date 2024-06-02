package com20.task4.dto.sensorDto;

import lombok.Builder;

import java.time.ZonedDateTime;

@Builder
public record SensorResponse(

        Long id,
        String info,
        String model,
        String type,
        ZonedDateTime installationDate,
        String status) {
}
