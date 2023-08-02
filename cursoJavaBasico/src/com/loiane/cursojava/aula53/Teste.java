package com.loiane.cursojava.aula53;

public class Teste {
    public static void main(String[] args) {

    }

    private static void usandoConstantes() {

        int DOMINGO = DiaSemanaConstante.DOMINGO;
        int SEGUNDA = DiaSemanaConstante.SEGUNDA_FEIRA;
        int TERCA = DiaSemanaConstante.TERCA_FEIRA;
        int QUARTA = DiaSemanaConstante.QUARTA_FEIRA;
        int QUINTA = DiaSemanaConstante.QUINTA_FEIRA;
        int SEXTA = DiaSemanaConstante.SEXTA_FEIRA;
        int SABADO = DiaSemanaConstante.SABADO;

        System.out.println("Teste utilizando constante no Java");
        imprimeDiaSemana(DOMINGO);
        imprimeDiaSemana(SEGUNDA);
        imprimeDiaSemana(TERCA);
        imprimeDiaSemana(QUARTA);
        imprimeDiaSemana(QUINTA);
        imprimeDiaSemana(SEXTA);
        imprimeDiaSemana(SABADO);





    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

    }

}
