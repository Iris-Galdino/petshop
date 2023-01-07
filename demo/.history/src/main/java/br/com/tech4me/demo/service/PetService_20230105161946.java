package br.com.tech4me.demo.service;

import java.util.List;

import br.com.tech4me.demo.model.Pet;
public interface PetService {
    Pet cadastrar(Pet Pet);
    List<Pet> obterTodos();
    
}
