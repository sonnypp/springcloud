package com.swp.euconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String gethelloString() {
        return this.restTemplate.getForObject("http://localhost:8083/hello", String.class);
    }

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String getHelloString() {
        return testService.hello();
    }
}
