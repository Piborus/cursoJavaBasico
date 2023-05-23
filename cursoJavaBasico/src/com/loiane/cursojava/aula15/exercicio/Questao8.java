package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Comparador de preço.");

		System.out.println("Quanto está o preço da manga.");
		double manga = sc.nextDouble();

		System.out.println("Quanto está o preço do maçã.");
		double maça = sc.nextDouble();

		System.out.println("Quanto está o preço da laranja");
		double laranja = sc.nextDouble();

		if (manga < maça && manga < laranja) {
			System.out.println("Compra manga.");
		} else if (maça < manga && maça < laranja) {
			System.out.println("Compra maçã.");
		} else if (laranja < manga && laranja < maça) {
			System.out.println("Compra laranja.");
		}

	}

}
