package com.vacina;

import java.util.Date;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int year = 2021;
        int month = 10;
        int day = 21;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);
        Date date = calendar.getTime();
        Pessoa pessoa = new Pessoa("Juvenal", "Brejinho", "13413515133", "Butantan", date);
        Registro registro = new RegVacinaProxy();
        registro.registrar(pessoa.dados());
    }
}
