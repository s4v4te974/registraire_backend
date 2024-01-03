package com.registraire.main.businesslogic;

import com.registraire.main.mapper.ContinuationTransformationMapper;
import com.registraire.main.mapper.DomaineValeurMapper;
import com.registraire.main.mapper.EntrepriseMapper;
import com.registraire.main.mapper.EtablissementMapper;
import com.registraire.main.mapper.FusionScissionMapper;
import com.registraire.main.mapper.NomMapper;
import com.registraire.main.models.dto.EntrepriseRecord;
import com.registraire.main.models.entities.Entreprise;
import com.registraire.main.repository.ContinuationTransformationRepo;
import com.registraire.main.repository.DomaineValeurRepo;
import com.registraire.main.repository.EntrepriseRepo;
import com.registraire.main.repository.EtablissementRepo;
import com.registraire.main.repository.FusionScissionRepo;
import com.registraire.main.repository.NomRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistraireBusinessLogic {

    private final EntrepriseRepo entrepriseRepo;

    private final ContinuationTransformationRepo continuationTransformationRepo;

    private final DomaineValeurRepo domaineValeurRepo;

    private final EtablissementRepo etablissementRepo;

    private final FusionScissionRepo fusionScissionRepo;

    private final NomRepo nomRepo;

    private ContinuationTransformationMapper contiTransfoMapper;

    private DomaineValeurMapper domaineValeurMapper;

    private final EntrepriseMapper entrepriseMapper = EntrepriseMapper.INSTANCE;

    private EtablissementMapper etablissementMapper;

    private FusionScissionMapper fusionScissionMapper;

    private NomMapper nomMapper;


    public EntrepriseRecord retrieveEntreprise(String neq) {
        Entreprise entreprise = entrepriseRepo.findById(neq).orElse(null);
        return entrepriseMapper.mapToEntrepriseRecord(entreprise);
    }
}
