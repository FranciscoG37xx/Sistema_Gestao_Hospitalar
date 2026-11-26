package com.gestaohospitalar.sistemahospitalar.identidade.service;

import com.gestaohospitalar.sistemahospitalar.identidade.model.Paciente;
import com.gestaohospitalar.sistemahospitalar.identidade.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repo;

    public List<Paciente> findAll() {
        return repo.findAll();
    }

    public Paciente findById(Long id) {
        Optional<Paciente> obj = repo.findById(id);
        return obj.get();
    }
}


