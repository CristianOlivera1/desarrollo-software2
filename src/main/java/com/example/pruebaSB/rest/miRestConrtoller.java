package com.example.pruebaSB.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class miRestConrtoller {
    @GetMapping("/")

    public String saludo(){
        return "HOla mundooooo";
    }
    public void Raton(){
        System.out.println("Rama de marco a Developmen");

    }
}
