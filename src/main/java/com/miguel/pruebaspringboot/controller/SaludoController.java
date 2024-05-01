package com.miguel.pruebaspringboot.controller;

import jakarta.websocket.server.PathParam;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/saludos")
public class SaludoController {


    @GetMapping("/hello")
    public String holaMundo(){
        return "Hola mundo";
    }
    @GetMapping("/hellonombre/{nombre}/{edad}")
    public String holaMundoNombre(
            @PathVariable String nombre,
            @PathVariable  int edad){
        return "<h1>hola " +nombre +" tu edad es:"+edad+" <h1/>";
    }


}
