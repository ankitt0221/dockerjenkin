package com.dockerjenkins.controllar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllar {

    @GetMapping("/")
    public String getMassage(){
        return "hello how are you ";
    }


}
