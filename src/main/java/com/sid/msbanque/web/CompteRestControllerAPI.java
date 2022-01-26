package com.sid.msbanque.web;

import com.sid.msbanque.entities.Compte;
import com.sid.msbanque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//@RestController
@RequestMapping("/banque")
public class CompteRestControllerAPI {
    @Autowired
    private CompteRepository compteRepository;

    @GetMapping(path = "/comptes", produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @GetMapping("/comptes/{id}")
    public Compte getOne(@PathVariable Long id) {
        return compteRepository.findById(id).get();
    }

    @PostMapping(path = "/comptes")
    public Compte save(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }

    @PutMapping("/comptes/{id}")
    public Compte update(@RequestBody Compte compte, @PathVariable Long id) {
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @DeleteMapping("/comptes/{id}")
    public void delete(@PathVariable Long id) {
        compteRepository.deleteById(id);
    }

}
