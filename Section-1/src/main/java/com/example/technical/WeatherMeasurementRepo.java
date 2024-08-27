package com.example.technical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WeatherMeasurementRepo extends JpaRepository<WeatherMeasurementEntity,Long> {
    @Query(value = "SELECT * FROM weather_measurement_entity WHERE time_stamp BETWEEN :startDate AND :endDate", nativeQuery = true)
    List<WeatherMeasurementEntity> findWeatherMeasurementsBetweenDates(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}
