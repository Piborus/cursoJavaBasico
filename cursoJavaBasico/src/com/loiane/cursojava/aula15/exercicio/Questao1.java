package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo valor: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1 < num2) {
			System.out.println(num2);
		}
	}

}
