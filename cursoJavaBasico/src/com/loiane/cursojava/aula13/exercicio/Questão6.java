package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo a calculadora de area do circulo.");
		
		System.out.println("\nDigite o raio do circulo: ");
		Scanner sc = new Scanner (System.in);
		double raioC = sc.nextDouble();
		
		double pi = 3.14;
		
		double areaC = pi * (raioC * raioC);
		
		System.out.println("A área do circulo é: " + areaC);
		
	}
	
}
