package br.com.tech4me.demo.service;

import org.springframework.stereotype.Service;


public class PetServiceImpl implements PetService{
    @AutoWired
    private PetRepository repositorio;

    @Override
    public Pet criarPet(Pet Pet){
        return repositorio.save(pet);
    }

    @Override
    public List<Pet> obterTodos() {
        return repositorio.findAll();
    }

    
}
