package br.com.tech4me.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.demo.model.Pet;
import br.com.tech4me.demo.service.PetService;


@RestController
@RequestMapping("/petshop")
public class PetController {
    @Autowired
    private PetService servico;

    @GetMapping
    public List<Pet> ObterPets(){
        return servico.obterTodos();
    }

    @PostMapping
    public Pet cadastrar(@RequestBody Pet pet){
        return servico.cadastrar(pet);
    }
    

    }
   
