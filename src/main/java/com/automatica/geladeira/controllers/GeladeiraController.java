package com.automatica.geladeira.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeladeiraController {

    @GetMapping
    public String teste() {
        return "Geladeira funcionando!";
    }

}
