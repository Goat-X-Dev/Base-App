package com.security.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class BaseController {

    @GetMapping
    public String getHello() {
        return "Hello From Main - Prod";
    }

}
