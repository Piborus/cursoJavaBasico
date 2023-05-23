package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao21 {

	static int contador100 = 0;
	static int contador50 = 0;
	static int contador10 = 0;
	static int contador5 = 0;
	static int contador1 = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor que deseja retirar:");
		double dinheiro = sc.nextDouble();
		System.out.println("\nO valor do seu saque é:");
		System.out.println("------------");
		System.out.println("| " + "R$" + dinheiro + " |");
		System.out.println("------------");

		
		
		if (dinheiro < 10.00 || dinheiro > 600.00) {
			System.out.println("Valor de saque fora do padrão.");
			System.out.println("Deseja continua na conta bancaria (s/n)");
			String resposta = sc.next();
			if (resposta.equalsIgnoreCase("s")) {
				main(null);
			}
		} else {
			while (dinheiro > 0) {
				if (dinheiro > 99) {
					dinheiro = dinheiro - 100;
					contador100 = contador100 + 1;
				} else if (dinheiro > 49) {
					dinheiro = dinheiro - 50;
					contador50 = contador50 + 1;
				} else if (dinheiro > 9) {
					dinheiro = dinheiro - 10;
					contador10 = contador10 + 1;
				} else if (dinheiro > 4) {
					dinheiro = dinheiro - 5;
					contador5 = contador5 + 1;
				} else {
					dinheiro = dinheiro - 1;
					contador1 = contador1 + 1;
				}

			}
			System.out.print("Você sacou " + contador100 + " notas de 100 reais, " + contador50 + " notas de 50 reais, "
					+ contador10 + " notas de 10 reais, " + contador5 + " notas de 5 reais, " + contador1
					+ " notas de 1 reais.");
		}
		System.out.println("\nTotalizando o valor total do saque: " + dinheiro + " reais.");
	}

}
