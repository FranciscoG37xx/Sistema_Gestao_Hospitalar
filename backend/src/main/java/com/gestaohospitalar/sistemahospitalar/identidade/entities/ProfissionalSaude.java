package com.gestaohospitalar.sistemahospitalar.identidade.entities;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
abstract public class ProfissionalSaude extends Utilizador {

    private String numeroCelula;

    public ProfissionalSaude() {}

    public ProfissionalSaude(Long id, String nome, String email, String passwordHash, boolean ativo, Perfil perfil, String numeroCelula) {
        super(id, nome, email, passwordHash, ativo, perfil);
        this.numeroCelula = numeroCelula;
    }

    public String getNumeroCelula() {
        return numeroCelula;
    }

    public void setNumeroCelula(String numeroCelula) {
        this.numeroCelula = numeroCelula;
    }
}
