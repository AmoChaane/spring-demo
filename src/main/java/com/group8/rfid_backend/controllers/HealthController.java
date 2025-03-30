package com.group8.rfid_backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/health/")
@CrossOrigin(origins = "http://localhost:5173") // Allow only this origin
public class HealthController {

    @GetMapping("")
    public String GetHealth() {
        return "API is in working condition";
    }
}
