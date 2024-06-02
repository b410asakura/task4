package com20.task4.api;

import com20.task4.dto.SimpleResponse;
import com20.task4.dto.alertDto.AlertRequest;
import com20.task4.dto.alertDto.AlertResponse;
import com20.task4.serivce.AlertService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alert")
@RequiredArgsConstructor
@PreAuthorize("hasAnyAuthority('ADMIN')")
@Tag(name = "Alert API")
public class AlertApi {
    private final AlertService alertService;

    @GetMapping("/getAll")
    @Operation(summary = "to get all alerts")
    List<AlertResponse> getAll() {
        return alertService.getAll();
    }

    @GetMapping("/getById")
    @Operation(summary = "to get alert by id")
    AlertResponse getById(@RequestParam Long id) {
        return alertService.getById(id);
    }

    @PostMapping
    @Operation(summary = "to save new alert")
    SimpleResponse save(@RequestBody AlertRequest alertRequest) {
        return alertService.save(alertRequest);
    }

    @DeleteMapping()
    @Operation(summary = "to delete a alert")
    SimpleResponse delete(@RequestParam Long id) {
        return alertService.delete(id);
    }

    @PutMapping()
    @Operation(summary = "to update the alert")
    SimpleResponse update(@RequestParam Long id,
                          @RequestBody AlertRequest alertRequest){
        return alertService.update(id, alertRequest);
    }

}
