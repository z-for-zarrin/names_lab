package com.example.task_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class NameController {

    @GetMapping()
    public String greeting() {
        return "Good afternoon!";
    }

}
