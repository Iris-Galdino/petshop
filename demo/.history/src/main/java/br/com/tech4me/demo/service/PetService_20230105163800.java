package br.com.tech4me.demo.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.demo.model.Pet;
public interface PetService {
    Pet cadastrar(Pet Pet);
    List<Pet> obterTodos();
    Optional<Pet> obterrId(String id);
    void excluirPetPorId(String id);
    Pet atualizarPetPorId(String id, Pet pet);
    
}
