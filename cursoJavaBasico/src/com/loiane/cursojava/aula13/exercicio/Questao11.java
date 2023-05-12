package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		System.err.println("Questão maluca");

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1 numero inteiro:");
		int num1 = sc.nextInt();

		System.out.println("Digite outro numero inteiro:");
		int num2 = sc.nextInt();

		System.out.println("Digite um numero real:");
		double num3 = sc.nextDouble();

		int calculo1 = (num1 * 2) / (num2 / 2);
		System.out.println("resultado: " + calculo1);

		double calculo2 = (num1 * 3) + num3;
		System.out.println("resultado: " + calculo2);

		double calculo3 = Math.pow(num3, 3);
		System.out.println("resultado: " + calculo3);

	}

}
