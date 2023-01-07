package br.com.tech4me.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.demo.model.Pet;

public interface PetRepository extends MongoRepository<Pet, String> {
    
}
