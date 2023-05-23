package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu dia.");
		int dia = sc.nextInt();
		if (dia < 1 || dia > 31) {
			System.out.println("Dia invalido.");
		} else {
			System.out.println("Digite o seu mês.");
			int mes = sc.nextInt();
			if (mes <= 0 || mes > 12) {
				System.out.println("Mês invalido.");
			} else {
				System.out.println("Digite o seu ano.");
				int ano = sc.nextInt();
				if (ano <= 0) {
					System.out.println("Ano invalido");
				} else {
					System.out.println("A sua data é " + dia + "/" + mes + "/" + ano);
				}
			}
		}
		System.out.println("Gostaria de continuar (s/n)");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			main(null);
		}
	}

}
