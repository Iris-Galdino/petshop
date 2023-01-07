package br.com.tech4me.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tech4me.demo.model.Pet;
@Service
public interface PetService {
    Pet criarPet(Pet Pet);
    List<Pet> obterTodos();
    
}
