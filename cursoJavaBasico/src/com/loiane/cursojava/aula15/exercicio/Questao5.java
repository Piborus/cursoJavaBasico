package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();

		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();

		double media = (nota1 + nota2) / 2;

		if (media < 7) {
			System.out.println("Reprovado.");
			main(null);
		} else if (media >= 7) {
			System.out.println("Aprovado.");
			main(null);
		} else if (media == 10) {
			System.out.println("Aprovado com distinção.");
			main(null);
		}
	}

}
