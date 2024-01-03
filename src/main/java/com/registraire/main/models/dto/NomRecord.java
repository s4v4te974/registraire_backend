package com.registraire.main.models.dto;

import java.time.LocalDate;

public record NomRecord(String uuid, String neq, String nomAssuj, String nomAssujLangEtrng,
                        String statNom, String typNomAssuj, LocalDate datInitNomAssuj,
                        LocalDate datFinNomAssuj, EntrepriseRecord entreprise) {
}
