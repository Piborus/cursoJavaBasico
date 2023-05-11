package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		System.out.println("\nBem vindo a calculadora salarial");
		
		System.out.println("\nQuanto você ganha por hora?");
		Scanner sc = new Scanner(System.in);
		double horaSalario = sc.nextDouble();
		
		System.out.println("\nQuantas horas você trabalha?");
		double horaTrabalhada = sc.nextDouble();
		
		System.out.println("\nQuantos dias trabalhados?");
		int diasTrabalhada = sc.nextInt();
		
		
		double totalSalario = (horaSalario * horaTrabalhada) / diasTrabalhada;
		
		System.out.println("\nO seu salario é de: " + "R$" + totalSalario);
		
		main(null);
		
	}

}
