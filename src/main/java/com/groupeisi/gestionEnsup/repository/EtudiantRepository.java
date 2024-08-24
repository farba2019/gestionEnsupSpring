package com.groupeisi.gestionEnsup.repository;

import com.groupeisi.gestionEnsup.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
