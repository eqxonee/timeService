package com.example.timeservice.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
public class DateWorker {
    public DateWorker(){
        this.date = new Date();
    }
    private Date date;
}
