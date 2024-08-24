package com.groupeisi.gestionEnsup.graphql;

import com.groupeisi.gestionEnsup.entity.Cours;
import com.groupeisi.gestionEnsup.entity.Etudiant;
import com.groupeisi.gestionEnsup.repository.CoursRepository;
import com.groupeisi.gestionEnsup.repository.EtudiantRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final EtudiantRepository etudiantRepository;
    private final CoursRepository coursRepository;

    public Query(EtudiantRepository etudiantRepository, CoursRepository coursRepository) {
        this.etudiantRepository = etudiantRepository;
        this.coursRepository = coursRepository;
    }

    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    public List<Etudiant> getTousLesEtudiants() {
        return etudiantRepository.findAll();
    }

    public Cours getCours(Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    public List<Cours> getTousLesCours() {
        return coursRepository.findAll();
    }
}
