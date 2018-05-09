package com.hey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public Map dc()throws Exception{
        String services = "Services: " + discoveryClient.getServices()+"+++++03";
        System.out.println(services+"+++++03");
        throw new RuntimeException();
        //return services;
    }

}