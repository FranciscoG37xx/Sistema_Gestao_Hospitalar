package com.gestaohospitalar.sistemahospitalar.identidade.entities;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.enums.Perfil;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Paciente extends Utilizador {

    private String numeroUtente;
    private LocalDate dataNascimento;
    private String nif;

    public Paciente() {}

    public Paciente(Long id, String nome, String email, String passwordHash, boolean ativo, String numeroUtente, LocalDate dataNascimento, String nif) {
        super(id, nome, email, passwordHash, ativo, Perfil.PACIENTE);
        this.numeroUtente = numeroUtente;
        this.dataNascimento = dataNascimento;
        this.nif = nif;
    }

    public String getNumeroUtente() {
        return numeroUtente;
    }

    public void setNumeroUtente(String numeroUtente) {
        this.numeroUtente = numeroUtente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
