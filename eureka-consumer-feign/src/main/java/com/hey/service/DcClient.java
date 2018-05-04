package com.hey.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by heer on 2018/5/3.
 */
@FeignClient(value = "eureka-client",fallback = DcClient.Fallback.class)
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

    @Component
    class Fallback implements DcClient{

        @Override
        public String consumer() {
            return "失败啦";
        }
    }
}
