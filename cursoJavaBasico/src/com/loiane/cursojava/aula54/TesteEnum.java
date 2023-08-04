package com.loiane.cursojava.aula54;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEGUNDA_FEIRA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(3, 8, 2023 , DiaSemana.QUINTA_FEIRA);



    }
}
