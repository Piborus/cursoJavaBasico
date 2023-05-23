package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo numero: ");
		int num2 = sc.nextInt();

		System.out.print("Digite o terceiro numero: ");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior numero é " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior numero é " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior numero é " + num3);
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor numero é " + num1);
		} else if (num2 < num1 && num2 < num1) {
			System.out.println("O menor numero é " + num2);
		} else if (num3 < num1 && num3 < num1) {
			System.out.println("O menor numero é " + num3);
		}
	}

}
