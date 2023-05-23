package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de A.");
		int valorA = sc.nextInt();
		if (valorA == 0) {
			System.out.println("A equação não é mais do segundo grau.");
			main(null);
		} else {
			System.out.println("Informe o valor de B.");
			int valorB = sc.nextInt();

			System.out.println("Informe o valor de C.");
			int valorC = sc.nextInt();

			double valorDelta = Math.pow(valorB, 2) - 4 * valorA * valorC;

			if (valorDelta < 0) {
				System.out.println("A equação não possui raizes reais.");
				main(null);
			} else if (valorDelta == 0) {
				System.out.println("A equação possui apenas uma raiz real.");
				main(null);
			} else if (valorDelta > 0) {
				System.out.println("A equação possui duas raizes reais ");
				main(null);
			}
		}
	}
}
