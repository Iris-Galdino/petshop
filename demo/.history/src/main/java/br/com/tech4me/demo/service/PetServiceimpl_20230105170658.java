package br.com.tech4me.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.demo.model.Pet;
import br.com.tech4me.demo.repository.PetRepository;

@Service
public class PetServiceImpl implements PetService{
    @Autowired
    private PetRepository repositorio;
    

    @Override
    public List<Pet> obterTodos() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Pet> obterPorId(String id) {
        return repositorio.findById(id);
    }

    @Override
    public void excluirPorId(String id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public Pet cadastrar(Pet Pet) {
        return repositorio.save(Pet);
    }

    @Override
  public Optional<Pizza> atualizarPorId(String id, Pizza pet) {
    Optional<Pizza> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      pet.setId(id);
      return Optional.of(repositorio.save(pet));
    } else {
      return Optional.empty();
    }
    

    

