package br.com.tech4me.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.tech4me.demo.model.Pet;

public class PetServiceImpl implements PetService{
    @Autowired
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
