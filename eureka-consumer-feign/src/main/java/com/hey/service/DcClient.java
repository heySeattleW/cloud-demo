package com.hey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by heer on 2018/5/3.
 */
@FeignClient(value = "eureka-client",fallback = DcClient.Fallback.class)
public interface DcClient {

    @GetMapping("/dc")
    Map consumer();

    @Component
    class Fallback implements DcClient{

        @Autowired
        private DiscoveryClient discoveryClient;

        @Override
        public Map consumer() {
            Map map = new HashMap();
            map.put("code",500);
            map.put("msg",discoveryClient.getServices()+"接口失败啦");
            return map;
        }
    }
}
