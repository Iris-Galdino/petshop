package br.com.tech4me.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.demo.model.Pet;
import br.com.tech4me.demo.repository.PetRepository;

@Service
public class PetServiceImpl implements PetService{
    @Autowired
    private PetRepository repositorio;
    

    @Override
    public List<Pizza> obterTodasAsPizzas() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Pizza> obterPizzaPorId(String id) {
        return repositorio.findById(id);
    }

    @Override
    public void excluirPizzaPorId(String id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public Pizza cadastrarPizza(Pizza pizza) {
        return repositorio.save(pizza);
    }

    @Override
    public Pizza atualizarPizzaPorId(String id, Pizza pizza) {
        pizza.setId(id);
        return repositorio.save(pizza);
    }
    
    }

    
}
