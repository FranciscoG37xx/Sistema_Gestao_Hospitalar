package com.gestaohospitalar.sistemahospitalar.identidade.entities;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Medico extends ProfissionalSaude{

    @ManyToMany
    @JoinTable(name = "tb_medico_especialidade")
    private Set<Especialidade> especialidade = new HashSet<>();

    public Medico() {}

    public Medico(Long id, String nome, String email, String passwordHash, boolean ativo, String numeroCelula) {
        super(id, nome, email, passwordHash, ativo, Perfil.MEDICO, numeroCelula);
    }

    public Set<Especialidade> getEspecialidade() {
        return especialidade;
    }
}
