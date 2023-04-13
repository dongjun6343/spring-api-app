package com.app.web;

import org.springframework.web.bind.annotation.GetMapping;

public class CorsController {

    @GetMapping("/cors")
    public String cors(){
        return "cors";
    }
}
