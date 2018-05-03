package com.hey.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by heer on 2018/5/3.
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
