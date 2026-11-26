package com.gestaohospitalar.sistemahospitalar.identidade.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
abstract public class Utilizador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String passwordHash;
    private boolean ativo;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    public Utilizador() {}

    public Utilizador(String nome, String email, String passwordHash, boolean ativo, Perfil perfil) {
        this.nome = nome;
        this.email = email;
        this.passwordHash = passwordHash;
        this.ativo = ativo;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Utilizador that = (Utilizador) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
