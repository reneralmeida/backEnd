package com.vacina;

public class RegistroVacina implements Registro {

    @Override
    public void registrar(Object[] dados) {
        System.out.println("Foi registrado o RG " + dados[0] + " na data " + dados[1].toString());
    }
}
