package com20.task4.serivce.impl;

import com20.task4.dto.SimpleResponse;
import com20.task4.dto.dataDto.DataRequest;
import com20.task4.dto.dataDto.DataResponse;
import com20.task4.entity.Data;
import com20.task4.globalException.NotFoundException;
import com20.task4.repository.DataRepository;
import com20.task4.serivce.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {
    private final DataRepository dataRepository;
    @Override
    public SimpleResponse update(Long id, DataRequest dataRequest) {
        Data data = dataRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no data with id: " + id
                )
        );
        data.setTemperature(dataRequest.temperature());
        data.setSpeed(dataRequest.speed());
        data.setPressure(dataRequest.pressure());
        dataRepository.save(data);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("data updated")
                .build();
    }

    @Override
    public SimpleResponse delete(Long id) {
        Data data = dataRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no data with id: " + id
                )
        );
        dataRepository.delete(data);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("data deleted")
                .build();
    }

    @Override
    public SimpleResponse save(DataRequest dataRequest) {
        Data data = new Data();
        data.setTemperature(dataRequest.temperature());
        data.setSpeed(dataRequest.speed());
        data.setPressure(dataRequest.pressure());
        dataRepository.save(data);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("data saved")
                .build();
    }

    @Override
    public DataResponse getById(Long id) {
        Data data = dataRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no data with id: " + id
                )
        );
        return new DataResponse(data.getId(), data.getTemperature(), data.getSpeed(), data.getPressure());
    }

    @Override
    public List<DataResponse> getAll() {
        return dataRepository.getAll();
    }
}
