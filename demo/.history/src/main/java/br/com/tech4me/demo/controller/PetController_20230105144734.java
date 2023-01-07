package br.com.tech4me.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*import br.com.tech4me.demo.model.Pet;
import br.com.tech4me.demo.service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
*/

@RestController
@RequestMapping("/petshop")
public class PetController {
    //@Autowired
    /*private PetService servico;

    @PostMapping
    public Pet CadastrarPet(@RequestBody Pet Pet){
        return servico.cadastrarPet(Pet);
    }

    @GetMapping
    public List<Pet> obterCardapio() {
        return servico.obterTodasAsPets(); 
    }

    @GetMapping
    public Optional<Pet> obterPet(@PathVariable String id) {
        return servico.obterPetPorId(id); 
    }

    @DeleteMapping("/{id}")
    public void excluirPet(@PathVariable String id){
        servico.excluirPetPorId(id);
    }

    @PutMapping("/{id}")
    public Pet atualizarPet(@PathVariable String id, @RequestBody Pet Pet){
        Pet.setId(id);
        return servico.atualizarPetPorId(id, Pet);
    */}
    
//}
