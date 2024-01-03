package com.registraire.main.controller;

import com.registraire.main.businesslogic.RegistraireBusinessLogic;
import com.registraire.main.models.dto.EntrepriseRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class RegistraireController {

    private final RegistraireBusinessLogic businessLogic;

    @GetMapping(value = "entreprises/")
    public ResponseEntity<EntrepriseRecord> retrieveEntreprise(
            @RequestParam String neq) {
        return new ResponseEntity<>(businessLogic.retrieveEntreprise(String.valueOf(neq)), HttpStatus.OK);
    }
}
