package com.registraire.main.mapper;

import com.registraire.main.mapper.utils.EntrepriseMapperUtils;
import com.registraire.main.models.dto.DomaineValeurRecord;
import com.registraire.main.models.entities.DomaineValeur;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DomaineValeurMapper {
    private final EntrepriseMapperUtils utils;

    public DomaineValeurRecord mapToDomaineRecord(DomaineValeur dm) {
        return new DomaineValeurRecord(
                dm.getCodDomVal(),
                dm.getValDomFran()
                //  utils.mapToEntrepriseRecord(conti.getEntreprise())
        );
    }
}
