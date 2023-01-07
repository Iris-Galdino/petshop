package br.com.tech4me.demo.service;

import java.util.List;

import br.com.tech4me.demo.model.Pet;
public interface PetService {
    Pet cadastrar(Pet Pet);
    List<Pet> obterTodos();
    
    List<Pizza> obterTodasAsPizzas();
    Optional<Pizza> obterPizzaPorId(String id);
    void excluirPizzaPorId(String id);
    Pizza cadastrarPizza(Pizza pizza);
    Pizza atualizarPizzaPorId(String id, Pizza pizza);
    
}
