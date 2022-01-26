package com.sid.msbanque.repositories;

import com.sid.msbanque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestController
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
