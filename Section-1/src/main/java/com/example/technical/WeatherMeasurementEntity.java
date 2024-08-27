package com.example.technical;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class WeatherMeasurementEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String stationId;

    private LocalDateTime timeStamp;

    private double temperature;

    private double humidity;

    private double windSpeed;

}
