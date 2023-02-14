package com.swp.euconsumer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient("eu-producter")
public interface TestService {

    @GetMapping("hello")  // 目标方法的url
    String hello();

}
