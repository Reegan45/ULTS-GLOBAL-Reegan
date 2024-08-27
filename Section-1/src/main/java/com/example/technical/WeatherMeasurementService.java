package com.example.technical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeatherMeasurementService {

    @Autowired
    private WeatherMeasurementRepo weatherMeasurementRepo;
    public WeatherMeasurementEntity create(WeatherMeasurementEntity weatherMeasurementEntity) {
        return weatherMeasurementRepo.save(weatherMeasurementEntity);
    }

    public List<WeatherMeasurementEntity> getall(LocalDateTime start, LocalDateTime end) {
        if (start == null || end == null) {
            return weatherMeasurementRepo.findAll();
        }
        return weatherMeasurementRepo.findWeatherMeasurementsBetweenDates(start, end);
        }

}
