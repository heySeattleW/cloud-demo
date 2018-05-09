package com.hey.controller;

import com.hey.service.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DcController {


    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public Map dc() {
        return dcClient.consumer();
    }

}