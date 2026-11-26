package com.gestaohospitalar.sistemahospitalar.config;

import com.gestaohospitalar.sistemahospitalar.identidade.model.Paciente;
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

    @Override
    public void run(String... args) throws Exception {

        LocalDate date = LocalDate.of(1999, 10, 19);
        LocalDate date2 = LocalDate.of(2001, 01, 30);


        Paciente p1 = new Paciente(null, "Maria", "maria@gmail.com", "1010", true, "15476621", date2, "250854856");
        Paciente p2 = new Paciente(null, "Fabio", "fabio@gmail.com", "1011", true, "112391843", date2, "213982713");

        pacienteRepository.saveAll(Arrays.asList(p1, p2));
    }
}
