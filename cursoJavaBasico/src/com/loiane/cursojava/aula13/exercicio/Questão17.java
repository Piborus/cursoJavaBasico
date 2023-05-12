package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questão17 {

	public static void main(String[] args) {

		System.out.println("Bem vindo a TINTAS S.A");

		Scanner sc = new Scanner(System.in);

		double lataTinta = 18.00;
		double galaoTinta = 3.6;

		System.out.print("Digite o valor da área a ser pintada: ");
		double areaPintada = sc.nextDouble();

		double quantidadeTinta = (areaPintada * areaPintada) / Math.pow(6, 2);
		quantidadeTinta = Math.round(quantidadeTinta * 100) / 100;
		System.out.println("A quantidade de tinta necessaria é de: " + quantidadeTinta + " L");

		System.out.println("\nPronto. Agora escolha opção abaixo para o volume de tinta.");
		System.out.println("Digite 1 para compra galão de tinta de 3,6L.");
		System.out.println("Digite 2 para compra lata de tinta de 18L.");
		System.out.println("Digite 3 para compra galão e lata de tinta.");
		int op = sc.nextInt();

		if (op == 1) {
			double precoTotal = (25 * quantidadeTinta) / galaoTinta;
			precoTotal = Math.round(precoTotal * 100) / 100;
			double sobra = galaoTinta - quantidadeTinta;
			if (sobra <= 0) {
				System.out.println("Não sobrou tinta , total da compra: R$ " + precoTotal);
			} else if (sobra > 0) {
				System.out.println("Vai sobrar " + sobra + " L de tinta" + " , total da compra: R$ " + precoTotal);
			}

		} else if (op == 2) {
			double precoTotal = (80 * quantidadeTinta) / lataTinta;
			precoTotal = Math.round(precoTotal * 100) / 100;
			double sobra = lataTinta - quantidadeTinta;
			if (sobra <= 0) {
				System.out.println("Não sobrou tinta , total da compra: R$ " + precoTotal);
			} else if (sobra > 0) {
				System.out.println("Vai sobrar " + sobra + " L" + " , total da compra: R$ " + precoTotal);
			}
		} else if (op == 3) {
			double precoTotal = (25 * quantidadeTinta) + (80 * quantidadeTinta) / galaoTinta + lataTinta;
			precoTotal = Math.round(precoTotal * 100) / 100;
			double precoTotalDesc = precoTotal * 0.010;
			precoTotalDesc = Math.round(precoTotalDesc * 100) / 100;
			double sobra = (lataTinta + galaoTinta) - quantidadeTinta;
			if (sobra <= 0) {
				System.out.println("Não sobrou tinta , total da compra: R$ " + precoTotal);
			} else if (sobra > 0) {
				System.out.println("Você vai utilizar  " + sobra + " L" + " , no valor total de R$ " + precoTotalDesc);
			}

		} else if (op > 3) {
			System.out.println("Opção invalida");
			System.out.close();
		}
		System.out.print("\nDeseja calcular novamente? (s/n): ");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			main(null);
		}

	}

}
