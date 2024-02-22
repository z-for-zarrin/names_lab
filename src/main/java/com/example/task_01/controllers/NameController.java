package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class NameController {

    @GetMapping
    public Greeting displayGreeting(@RequestParam(required = false) String timeOfDay) {
        return new Greeting("Zarrin", timeOfDay);
    }

    @GetMapping(value = "/summer")
    public Celebration celebrate() {
        return new Celebration("Happy summer solstice!");
    }

}
