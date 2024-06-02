package com20.task4.serivce;

import com20.task4.dto.SimpleResponse;
import com20.task4.dto.sensorDto.SensorResponse;
import com20.task4.dto.sensorDto.SensorRequest;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.List;

public interface SensorService {
    SimpleResponse update(Long id, SensorRequest sensorRequest);

    SimpleResponse delete(Long id);

    SimpleResponse save(SensorRequest equipmentRequest);

    SensorResponse getById(Long id);

    List<SensorResponse> getAll();
}
