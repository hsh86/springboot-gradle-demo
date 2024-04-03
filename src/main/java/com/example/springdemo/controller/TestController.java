package com.example.springdemo.controller;

import com.example.springdemo.entity.Location;
import com.example.springdemo.repository.LocationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class TestController {

//    @Autowired
    private LocationRepository locationRepository;

    public TestController(LocationRepository lp){
        this.locationRepository=lp;
    }

    @GetMapping("/test")
    public List<Location> test() {
        return locationRepository.findAll();
    }
}
