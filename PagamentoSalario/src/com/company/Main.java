package com.company;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Efetivo("Augusto", "Junior", "13454145", 6000, 850, 2500);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Ruiz", "Sartes", "135135155", 350, 150);
        funcionario.pagamentoSalario();
    }
}
