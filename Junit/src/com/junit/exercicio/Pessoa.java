package com.junit.exercicio;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private String sobrenome;
    LocalDate idade;
    private String email;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String calcNome() {
        return this.nome + ", " + this.sobrenome;
    }

    public boolean majority() {
        return Period.between(this.idade, LocalDate.of(2021, 10, 25)).getYears() > 18;
    }
}


