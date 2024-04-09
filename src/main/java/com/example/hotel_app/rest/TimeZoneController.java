package com.example.hotel_app.rest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/timezone")
@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneController {

    @GetMapping("/presentation-time")
   public String[] getConvertedTime() {
        return TimeZone.getConvertedTimes();
    }
}

