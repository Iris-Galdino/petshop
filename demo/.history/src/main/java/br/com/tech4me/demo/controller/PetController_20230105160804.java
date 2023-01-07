package br.com.tech4me.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/petshop")
public class PetController {
    @Autowired
    private PetService servico;

    @GetMapping
    public String requisicaoGet(){
        return "olá mundo";
    }

    }
   
