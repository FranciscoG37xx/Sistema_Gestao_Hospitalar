package com.gestaohospitalar.sistemahospitalar.identidade.entities;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.enums.Perfil;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Paciente extends Utilizador {

    private String numeroUtente;
    private LocalDate dataNascimento;
    private String nif;

    @Embedded
    private Morada morada;

    public Paciente() {}

    public Paciente(Long id, String nome, String email, String passwordHash, boolean ativo, String numeroUtente, LocalDate dataNascimento, String nif, Morada morada) {
        super(id, nome, email, passwordHash, ativo, Perfil.PACIENTE);
        this.numeroUtente = numeroUtente;
        this.dataNascimento = dataNascimento;
        this.nif = nif;
        this.morada = morada;
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

    public Morada getMorada() {
        return morada;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }
}

