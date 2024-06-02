package com20.task4.serivce;

import com20.task4.dto.SimpleResponse;
import com20.task4.dto.alertDto.AlertRequest;
import com20.task4.dto.alertDto.AlertResponse;

import java.util.List;

public interface AlertService {
    List<AlertResponse> getAll();

    AlertResponse getById(Long id);

    SimpleResponse save(AlertRequest alertRequest);

    SimpleResponse delete(Long id);

    SimpleResponse update(Long id, AlertRequest alertRequest);
}
