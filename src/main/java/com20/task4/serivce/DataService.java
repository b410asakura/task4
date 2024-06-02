package com20.task4.serivce;

import com20.task4.dto.SimpleResponse;
import com20.task4.dto.dataDto.DataRequest;
import com20.task4.dto.dataDto.DataResponse;

import java.util.List;

public interface DataService {
    SimpleResponse update(Long id, DataRequest dataRequest);

    SimpleResponse delete(Long id);

    SimpleResponse save(DataRequest dataRequest);

    DataResponse getById(Long id);

    List<DataResponse> getAll();
}
