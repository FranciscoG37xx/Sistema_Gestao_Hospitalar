package com.gestaohospitalar.sistemahospitalar.identidade.model;

import java.time.LocalDate;

public class Paciente extends Utilizador {

    private String numeroUtente;
    private LocalDate dataNascimento;
    private String nif;

    public Paciente() {}

    public Paciente(String nome, String email, String passwordHash, boolean ativo, Perfil perfil, String numeroUtente, LocalDate dataNascimento, String nif) {
        super(nome, email, passwordHash, ativo, perfil);
        this.numeroUtente = numeroUtente;
        this.dataNascimento = dataNascimento;
        this.nif = nif;
    }
}
