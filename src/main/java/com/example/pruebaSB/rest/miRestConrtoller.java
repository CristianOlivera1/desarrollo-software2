package com.example.pruebaSB.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.System.*;

@RestController
public class miRestConrtoller {
    @GetMapping("/")

    public String saludo(){
        return "HOla mundo";
    }
    public String respuesta(){
        return "saludo de respuesta";
    }

}
