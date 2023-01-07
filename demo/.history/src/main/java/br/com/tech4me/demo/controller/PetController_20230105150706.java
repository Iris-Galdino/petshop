package br.com.tech4me.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/petshop")
public class PetController {

    @GetMapping
    public String requisicaoGet(){
        return "olá mundo";
    }

    }
   
