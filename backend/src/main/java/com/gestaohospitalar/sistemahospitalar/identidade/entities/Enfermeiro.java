package com.gestaohospitalar.sistemahospitalar.identidade.entities;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Enfermeiro extends ProfissionalSaude{

    public Enfermeiro(Long id, String nome, String email, String passwordHash, boolean ativo, String numeroCelula) {
        super(id, nome, email, passwordHash, ativo, Perfil.ENFERMEIRO, numeroCelula);
    }
}
