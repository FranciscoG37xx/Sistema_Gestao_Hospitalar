package com.gestaohospitalar.sistemahospitalar.identidade.service;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.Especialidade;
import com.gestaohospitalar.sistemahospitalar.identidade.repository.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadeService
{

    @Autowired
    private EspecialidadeRepository repo;

    public List<Especialidade> findAll() {
        return repo.findAll();
    }
}
