package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class NameController {

    @GetMapping()
    public String displayGreeting(Greeting greeting) {
        return String.format("Good %s, %s!", greeting.getTimeOfDay(), greeting.getName());
    }

    public String displayTimeOfDay(@RequestParam(required = false) String timeOfDay) {
        return "Time of Day: " + timeOfDay;
    }

}
