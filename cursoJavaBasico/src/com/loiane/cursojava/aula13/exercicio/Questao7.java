package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		
		System.out.println("\nBem vindo a calculadora da area do quadrado.");
		
		System.out.println("Digite o valor: ");
		Scanner sc = new Scanner (System.in);
		double areaQ = sc.nextDouble();
		
		double quadrado = (areaQ * areaQ);
		double dobQuadrado = quadrado * 2;
		System.out.println("A área do quadrado é: " + quadrado + ". E o dobro dela é: " + dobQuadrado);
		
		main(null);

	}

}
