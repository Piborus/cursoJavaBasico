package com.loiane.cursojava.aula54;

public class Formulario {

    public enum Genero {
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }

    }
    private String nome;
    private Genero genero;
}
