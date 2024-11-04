package com.example.pruebaSB.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class miRestConrtoller {
    @GetMapping("/")

    public String saludo(){
        String feature= "cambios desde feature a development";
        return "HOla mundo para cambios";
    }

}
