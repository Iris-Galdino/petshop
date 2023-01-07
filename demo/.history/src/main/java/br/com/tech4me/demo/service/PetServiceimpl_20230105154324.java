package br.com.tech4me.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tech4me.demo.model.Pet;
import br.com.tech4me.demo.repository.PetRepository;

public class PetServiceImpl implements PetService{
    @AutoWired
    private PetRepository repositorio;

    @Override
    public Pet criarPet(Pet Pet){
        return repositorio.save(Pet);
    }

    @Override
    public List<Pet> obterTodos() {
        return repositorio.findAll();
    }

    
}
