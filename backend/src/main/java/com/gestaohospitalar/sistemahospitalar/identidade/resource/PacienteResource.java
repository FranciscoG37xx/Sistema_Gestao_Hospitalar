package com.gestaohospitalar.sistemahospitalar.identidade.resource;

import com.gestaohospitalar.sistemahospitalar.identidade.model.Paciente;
import com.gestaohospitalar.sistemahospitalar.identidade.model.Perfil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/patients")
public class PacienteResource {

    LocalDate date = LocalDate.of(1999, 10, 19);

    @GetMapping
    public ResponseEntity<Paciente> findAll() {
        Paciente p = new Paciente("Maria", "maria@gmail.com", "1010", true, Perfil.PACIENTE, "15476621", date, "250854856");
        return ResponseEntity.ok().body(p);
    }
}
