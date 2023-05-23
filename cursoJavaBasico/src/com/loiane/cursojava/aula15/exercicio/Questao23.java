package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros some os valor e descubra se ele é decimal ou real.");
		double num1 = sc.nextDouble();
		
		if (Math.floor(num1) == num1) {
			System.out.println("O numero é inteiro.");
			main(null);
		} else {
			System.out.println("O numero é decimal.");
			main(null);
		}
		

	}

}
