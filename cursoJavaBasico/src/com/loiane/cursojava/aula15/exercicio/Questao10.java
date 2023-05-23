package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Em que turno você estuda?\n");

		System.out.println("Digite M para matutino.");
		System.out.println("Digite V para vespertino.");
		System.out.println("Digite N para noturno.");

		String turno = sc.next();

		switch (turno) {
		case "M", "m", "matutino", "Matutino":
			System.out.println("Você estuda no turno matutino.");
			break;
		case "V", "v", "Vespertino", "vespertino":
			System.out.println("Você estuda no turno vespertino.");
			break;
		case "N", "n", "Noturno", "noturno":
			System.out.println("Você estuda no turno noturno.");
			break;
		default:
			System.out.println("comando invalido");
			break;
		}
		System.out.print("\nDeseja calcular novamente? (s/n): ");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			main(null);
		}
	}

}
