package com.example.technical;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WeatherMeasurementController {
    @Autowired
    private WeatherMeasurementService weatherMeasurementService;


    @PostMapping("/api/measurements")
    public ResponseEntity<WeatherMeasurementEntity> create(@RequestBody WeatherMeasurementEntity weatherMeasurementEntity){
        return new ResponseEntity<>(weatherMeasurementService.create(weatherMeasurementEntity),HttpStatus.CREATED);
    }

    @GetMapping("/api/measurements")
    public ResponseEntity<List> getall(@RequestParam(value = "start",required = false)
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        LocalDateTime start, @RequestParam(value = "end",required = false)
                @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        LocalDateTime end){
        return ResponseEntity.ok(weatherMeasurementService.getall(start,end));

    }
}
