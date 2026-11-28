package com.gestaohospitalar.sistemahospitalar.identidade.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Morada implements Serializable {
    private static final long serialVersionUID = 1L;

    private String rua;
    private String codigoPostal;
    private String localidade;

    public Morada() {
    }

    public Morada(String rua, String codigoPostal, String localidade) {
        this.rua = rua;
        this.codigoPostal = codigoPostal;
        this.localidade = localidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Morada morada = (Morada) o;
        return Objects.equals(rua, morada.rua) && Objects.equals(codigoPostal, morada.codigoPostal) && Objects.equals(localidade, morada.localidade);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(rua);
        result = 31 * result + Objects.hashCode(codigoPostal);
        result = 31 * result + Objects.hashCode(localidade);
        return result;
    }
}

