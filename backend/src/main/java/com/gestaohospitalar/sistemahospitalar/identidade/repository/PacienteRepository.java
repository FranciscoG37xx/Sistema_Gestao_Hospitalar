package com.gestaohospitalar.sistemahospitalar.identidade.repository;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
