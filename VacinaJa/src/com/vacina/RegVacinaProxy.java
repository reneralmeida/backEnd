package com.vacina;

import java.util.Date;

public class RegVacinaProxy implements Registro{

    @Override
    public void registrar(Object[] dados) {
        if (verificarData((Date)(dados[1]))) {
            RegistroVacina registro = new RegistroVacina();
            registro.registrar(dados);
        } else {
            System.out.println("Impedido de vacinar em data futura");
        }
    }

    public boolean verificarData(Date data) {
        return data.before(new Date());
    }
}
