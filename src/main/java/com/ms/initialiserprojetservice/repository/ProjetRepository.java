package com.ms.initialiserprojetservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.initialiserprojetservice.model.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

    public List<Projet> findAllByChefProjetId(Long id);
    public Optional<Projet> findByNom(String nom);
}
