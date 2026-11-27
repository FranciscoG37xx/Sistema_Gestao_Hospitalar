package com.gestaohospitalar.sistemahospitalar.identidade.entities;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Medico extends ProfissionalSaude{

    public Medico(Long id, String nome, String email, String passwordHash, boolean ativo, String numeroCelula) {
        super(id, nome, email, passwordHash, ativo, Perfil.MEDICO, numeroCelula);
    }
}
