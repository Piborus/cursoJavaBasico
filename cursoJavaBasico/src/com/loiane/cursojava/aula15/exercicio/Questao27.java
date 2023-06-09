package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao27 {

	static double precoPesoMorango = 2.50;
	static double precoPesoMaca = 1.80;
	static double pesoUnidadeMaca = 0.130;
	static double pesoUnidadeMorango = 0.024;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		escolher(sc);
		novaCompra();

	}

	public static void escolher(Scanner sc) {

		System.out.println("BEM VINDO A LOJA BATMAN FEIRA DE FRUTA.");
		System.out.println("\nAqui temos apenas duas frutas(Maçã e Morango).");
		System.out.println("\nDigite a fruta que queria, caso queira as duas digite ambas as frutas:");
		String escolha = sc.nextLine();

		switch (escolha.toLowerCase()) {
		case "maçã", "maça", "macã", "maca":
			System.out.println("você escolheu maçã.");
			quantidadeFruta(sc, "maçã");
			break;
		case "morango":
			System.out.println("Você escolheu morango.");
			quantidadeFruta(sc, "morango");
			break;
		case "ambas":
			System.out.println("Você escolheu ambas as frutas.");
			quantidadeFruta(sc, "ambas");
			break;
		default:
			System.out.println("Comando invalido");
			break;

		}

	}

	public static void quantidadeFruta(Scanner sc, String escolha) {

		System.out.println("\nDigite a forma de quantidade desejada. \nDigite 'kg' para peso ou 'unid' para unidades:");
		String quantidade = sc.nextLine();

		if (quantidade.equalsIgnoreCase("kg")) {
			System.out.println("\nDigite o peso desejado em kg:");
			double pesoFruta = sc.nextDouble();
			calcularPesoFruta(pesoFruta, escolha);
		} else if (quantidade.equalsIgnoreCase("unid")) {
			System.out.println("\nDigite a quantidade desejada em unidades:");
			int quantidadeFruta = sc.nextInt();
			calcularUnidadeFruta(quantidadeFruta, escolha);
		} else {
			System.out.println("Opção inválida");
		}
	}

	public static void calcularPesoFruta(double pesoFruta, String escolha) {

		double valorTotal = 0;
		if (escolha.equalsIgnoreCase("maçã")) {
			valorTotal = pesoFruta * precoPesoMaca;
		} else if (escolha.equalsIgnoreCase("morango")) {
			valorTotal = pesoFruta * precoPesoMorango;
		} else if (escolha.equalsIgnoreCase("ambas")) {
			double pesoFruta1 = 0;
			System.out.println("\nDigite o peso desejado de morango:");
			Scanner scanner = new Scanner(System.in);
			pesoFruta1 = scanner.nextDouble();
			double valorTotalMaca = pesoFruta * precoPesoMaca;
			double valorTotalMorango = pesoFruta1 * precoPesoMorango;
			valorTotal = valorTotalMaca + valorTotalMorango;
		}

		if (valorTotal >= 25.00) {
			double desconto = valorTotal * 0.10;
			double novoValor = valorTotal - desconto;
			System.out.println("O valor total com desconto: R$ " + novoValor);
		} else {
			System.out.println("Valor Total: R$ " + valorTotal);
		}

		novaCompra();

	}

	public static void calcularUnidadeFruta(int unidFruta, String escolha) {

		double valorTotal = 0;
		if (escolha.equalsIgnoreCase("maçã")) {
			double pesoTotal = unidFruta * pesoUnidadeMaca;
			valorTotal = pesoTotal * precoPesoMaca;
		} else if (escolha.equalsIgnoreCase("morango")) {
			double pesoTotal = unidFruta * pesoUnidadeMorango;
			valorTotal = pesoTotal * precoPesoMorango;
		} else if (escolha.equalsIgnoreCase("ambas")) {
			int quantidadeFruta1 = 0;
			System.out.println("\nDigite a quantidade de morango:");
			Scanner sc2 = new Scanner(System.in);
			quantidadeFruta1 = sc2.nextInt();
			double pesoTotalMaca = unidFruta * pesoUnidadeMaca;
			double pesoTotalMorango = quantidadeFruta1 * pesoUnidadeMorango;
			double valorTotalMaca = pesoTotalMaca * precoPesoMaca;
			double valorTotalMorango = pesoTotalMorango * precoPesoMorango;
			valorTotal = valorTotalMaca + valorTotalMorango;
		}

		if (valorTotal >= 8.00) {
			double desconto = valorTotal * 0.10;
			double novoValor = valorTotal - desconto;
			System.out.println("O valor total com desconto: R$ " + novoValor);
		} else {
			System.out.println("Valor Total: R$ " + valorTotal);
		}

		novaCompra();
	}

	public static void novaCompra() {

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Deseja fazer uma nova compra(s/n)");
		String decisao = sc3.next();
		if (decisao.equalsIgnoreCase("s")) {
			System.out.println("Vamos iniciar nova compra.");
			escolher(sc3);
		} else {
			System.out.println("OBRIGADO POR COMPRA NO BATMAN FEIRA DA FRUTA.");
		}

	}

}
/*
 * 1. String substring(): Este método possui duas variantes e retorna uma nova
 * string que é uma substring desta string. A substring começa com o caractere
 * no índice especificado e se estende até o final desta string. Endindex da
 * substring começa em 1 e não em 0.
 */
/*
 * 2. String substring(begIndex, endIndex): Este método tem duas variantes e
 * retorna uma nova string que é uma substring desta string. A substring começa
 * com o caractere no índice especificado e se estende até o final desta string
 * ou até endIndex – 1 se o segundo argumento for fornecido.
 */

/*
 * O indexOf()método retorna a posição da primeira ocorrência do(s) caracter(es)
 * especificado(s) em uma string. Dica: Use o método lastIndexOf para retornar a
 * posição da última ocorrência do(s) caractere(s) especificado(s) em uma
 * string.
 */
