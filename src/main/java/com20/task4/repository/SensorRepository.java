package com20.task4.repository;

import com20.task4.dto.sensorDto.SensorResponse;
import com20.task4.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
    @Query("select new com20.task4.dto.sensorDto.SensorResponse(e.id, e.info, e.model, e.type, e.installationDate, e.status) from Sensor e")
    List<SensorResponse> getAll();
}
