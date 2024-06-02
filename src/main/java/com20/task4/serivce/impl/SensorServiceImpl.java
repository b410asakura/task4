package com20.task4.serivce.impl;

import com20.task4.dto.SimpleResponse;
import com20.task4.dto.sensorDto.SensorResponse;
import com20.task4.dto.sensorDto.SensorRequest;
import com20.task4.entity.Sensor;
import com20.task4.globalException.NotFoundException;
import com20.task4.repository.SensorRepository;
import com20.task4.serivce.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorServiceImpl implements SensorService {
    private final SensorRepository sensorRepository;

    @Override
    public SimpleResponse update(Long id, SensorRequest equipmentRequest) {
        Sensor sensor = sensorRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no sensor with id: " + id
                )
        );
        sensor.setInfo(equipmentRequest.info());
        sensor.setModel(equipmentRequest.model());
        sensor.setType(equipmentRequest.type());
        sensor.setInstallationDate(equipmentRequest.installationDate());
        sensor.setStatus(equipmentRequest.status());
        sensorRepository.save(sensor);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("sensor updated")
                .build();
    }

    @Override
    public SimpleResponse delete(Long id) {
        Sensor sensor = sensorRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no sensor with id: " + id
                )
        );
        sensorRepository.delete(sensor);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("sensor deleted")
                .build();
    }

    @Override
    public SimpleResponse save(SensorRequest equipmentRequest) {
        Sensor sensor = new Sensor();
        sensor.setInfo(equipmentRequest.info());
        sensor.setModel(equipmentRequest.model());
        sensor.setType(equipmentRequest.type());
        sensor.setInstallationDate(equipmentRequest.installationDate());
        sensor.setStatus(equipmentRequest.status());
        sensorRepository.save(sensor);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("sensor saved")
                .build();
    }

    @Override
    public SensorResponse getById(Long id) {
        Sensor sensor = sensorRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no sensor with id: " + id
                )
        );
        return SensorResponse.builder()
                .info(sensor.getInfo())
                .model(sensor.getModel())
                .type(sensor.getType())
                .installationDate(sensor.getInstallationDate())
                .status(sensor.getStatus())
                .build();
    }

    @Override
    public List<SensorResponse> getAll() {
        return sensorRepository.getAll();
    }
}
