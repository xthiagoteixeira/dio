package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private final LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade(){
        return (int) (ChronoUnit.YEARS.between(dataNascimento, LocalDate.now()));

    }

    public boolean ehMaiorDeIdade(){
        return (getIdade() >= 18);
    }
}
