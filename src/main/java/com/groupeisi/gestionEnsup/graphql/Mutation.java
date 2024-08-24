package com.groupeisi.gestionEnsup.graphql;

import com.groupeisi.gestionEnsup.entity.Cours;
import com.groupeisi.gestionEnsup.entity.Etudiant;
import com.groupeisi.gestionEnsup.repository.CoursRepository;
import com.groupeisi.gestionEnsup.repository.EtudiantRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final EtudiantRepository etudiantRepository;
    private final CoursRepository coursRepository;

    public Mutation(EtudiantRepository etudiantRepository, CoursRepository coursRepository) {
        this.etudiantRepository = etudiantRepository;
        this.coursRepository = coursRepository;
    }

    public Etudiant ajouterEtudiant(String nom, String prenom) {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        return etudiantRepository.save(etudiant);
    }

    public Cours ajouterCours(String titre, String description) {
        Cours cours = new Cours();
        cours.setTitre(titre);
        cours.setDescription(description);
        return coursRepository.save(cours);
    }
}
