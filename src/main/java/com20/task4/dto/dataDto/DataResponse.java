package com20.task4.dto.dataDto;

import lombok.Builder;

@Builder
public record DataResponse(
        Long id,
        String temperature,
        String speed,
        String pressure) {
}
