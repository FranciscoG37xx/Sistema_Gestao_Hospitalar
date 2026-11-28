package com.gestaohospitalar.sistemahospitalar.config;

import com.gestaohospitalar.sistemahospitalar.identidade.entities.Especialidade;
import com.gestaohospitalar.sistemahospitalar.identidade.entities.Morada;
import com.gestaohospitalar.sistemahospitalar.identidade.entities.Paciente;
import com.gestaohospitalar.sistemahospitalar.identidade.repository.EspecialidadeRepository;
import com.gestaohospitalar.sistemahospitalar.identidade.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private EspecialidadeRepository especialidadeRepo;

    @Override
    public void run(String... args) throws Exception {

        Morada m1 = new Morada("Praceta de Goa", "3800-000", "Aveiro");

        Paciente p1 = new Paciente(null, "Maria", "maria@gmail.com", "1010", true, "15476621", LocalDate.parse("1999-10-19"), "250854856", m1);
        Paciente p2 = new Paciente(null, "Fabio", "fabio@gmail.com", "1011", true, "112391843", LocalDate.parse("2001-03-12"), "213982713", m1);

        pacienteRepository.saveAll(Arrays.asList(p1, p2));

        Especialidade e1 = new Especialidade(null, "Cardiologia");

        especialidadeRepo.save(e1);
    }
}
