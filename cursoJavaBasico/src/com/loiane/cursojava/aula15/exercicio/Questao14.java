package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {

		System.out.println(
				"Vamos calcular suas notas, de acordo as sua media será alocado a um conceito de acordo a tabaela abaixo.");
		System.out.println("\nMédia de aproveitamento:" + "       Conceito:");
		System.out.println("Entre 9.0 e 10.0" + "                   A");
		System.out.println("Entre 7.5 e 9.0" + "                    B");
		System.out.println("Entre 6.0 e 7.5" + "                    C");
		System.out.println("Entre 4.0 e 6.0" + "                    D");
		System.out.println("Entre 4.0 e ZERO" + "                   E");

		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite a sua primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a sua segunda nota:");
		double nota2 = sc.nextDouble();

		double media = nota1 + nota2 / 2;

		if (media >= 9.0 && media <= 10.0) {
			System.out.println("A sua nota parcial é " + nota1 + " e bimestral " + nota2 + " .Com media de " + media);
			System.out.println("\nConceito A");
			System.out.println("APROVADO");
		} else if (media >= 7.5 && media < 9.0) {
			System.out.println("A sua nota parcial é " + nota1 + " e bimestral " + nota2 + " .Com media de " + media);
			System.out.println("\nConceito B");
			System.out.println("APROVADO");
		} else if (media >= 6.0 && media < 7.5) {
			System.out.println("A sua nota parcial é " + nota1 + " e bimestral " + nota2 + " .Com media de " + media);
			System.out.println("\nConceito C");
			System.out.println("APROVADO");
		} else if (media >= 4.0 && media < 6.0) {
			System.out.println("A sua nota parcial é " + nota1 + " e bimestral " + nota2 + " .Com media de " + media);
			System.out.println("\nConceito D");
			System.out.println("REPROVADO");
		} else {
			System.out.println("A sua nota parcial é " + nota1 + " e bimestral " + nota2 + " .Com media de " + media);
			System.out.println("\nConceito E");
			System.out.println("REPROVADO");
		}
		System.out.println("Deseja continuar: (s/n)");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			main(null);

		}

	}

}
