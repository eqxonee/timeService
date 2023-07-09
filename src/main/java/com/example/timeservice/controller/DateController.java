package com.example.timeservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
@RequestMapping(path = "/date")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class DateController {

    @GetMapping(value = "/get")
    public Date getDate(){
        DateWorker dateWorker = new DateWorker();
        return new Date(dateWorker.getDate().getTime());
    }
}
