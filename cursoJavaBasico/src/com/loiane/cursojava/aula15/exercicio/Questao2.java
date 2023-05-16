package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int num1 = sc.nextInt();

		if (num1 >= 0) {
			System.out.println("Ele é positivo");
		} else if (num1 < 0) {
			System.out.println("Ele é nagativo");
		}
	}

}
