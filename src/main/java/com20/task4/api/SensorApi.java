package com20.task4.api;

import com20.task4.dto.SimpleResponse;
import com20.task4.dto.sensorDto.SensorRequest;
import com20.task4.dto.sensorDto.SensorResponse;
import com20.task4.serivce.SensorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
@RequiredArgsConstructor
@PreAuthorize("hasAnyAuthority('ADMIN')")
@Tag(name = "Sensor API")
public class SensorApi {
    private final SensorService sensorService;

    @GetMapping("/getAll")
    @Operation(summary = "to get all sensor")
    List<SensorResponse> getAll() {
        return sensorService.getAll();
    }

    @GetMapping("/getById")
    @Operation(summary = "to get sensor by id")
    SensorResponse getById(@RequestParam Long id) {
        return sensorService.getById(id);
    }

    @PostMapping
    @Operation(summary = "to save new sensor")
    SimpleResponse save(@RequestBody SensorRequest equipmentRequest) {
        return sensorService.save(equipmentRequest);
    }

    @DeleteMapping()
    @Operation(summary = "to delete a sensor")
    SimpleResponse delete(@RequestParam Long id) {
        return sensorService.delete(id);
    }

    @PutMapping()
    @Operation(summary = "to update the sensor")
    SimpleResponse update(@RequestParam Long id,
                          @RequestBody SensorRequest equipmentRequest){
        return sensorService.update(id, equipmentRequest);
    }
}
