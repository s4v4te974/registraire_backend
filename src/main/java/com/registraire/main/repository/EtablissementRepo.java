package com.registraire.main.repository;

import com.registraire.main.models.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtablissementRepo extends JpaRepository<Etablissement, String> {
}
