package com.registraire.main.mapper;

import com.registraire.main.mapper.utils.EntrepriseMapperUtils;
import com.registraire.main.models.dto.EntrepriseRecord;
import com.registraire.main.models.dto.NomRecord;
import com.registraire.main.models.entities.Entreprise;
import com.registraire.main.models.entities.Nom;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NomMapper {

    NomMapper INSTANCE = Mappers.getMapper(NomMapper.class);

    @Mapping(target = "uuid", source = "uuid", expression = "java(UUID.toString())")
    @Mapping(target = "entreprise", source = "entreprise", qualifiedByName = "entrepriseNom")
    NomRecord mapToFusci(Nom nom);

    @Named("entrepriseNom")
    default EntrepriseRecord mapEntrepriseForNom(Entreprise entreprise) {
        return EntrepriseMapperUtils.mapToEntrepriseRecord(entreprise);
    }
}
