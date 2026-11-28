package com.gestaohospitalar.sistemahospitalar.identidade.resource;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.Especialidade;
import com.gestaohospitalar.sistemahospitalar.identidade.service.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/specialties")
public class EspecialidadeResource {

    @Autowired
    private EspecialidadeService service;

    @GetMapping
    public ResponseEntity<List<Especialidade>> findAll() {
        List<Especialidade> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
