package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo a calculadora de area do circulo.");
		
		System.out.println("\nDigite o raio do circulo: ");
		Scanner sc = new Scanner (System.in);
		double raioC = sc.nextDouble();
		
		
		double areaC = Math.PI *(Math.pow(raioC, 2));
		areaC = Math.round(areaC * 100)/100;
		
		System.out.println("A área do circulo é: " + areaC);
		
	}
	
}
