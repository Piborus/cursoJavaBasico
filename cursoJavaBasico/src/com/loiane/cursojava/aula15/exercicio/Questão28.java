package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questão28 {

	static double fileDuplo = 4.90;
	static double alcatra = 5.90;
	static double picanha = 6.90;
	static double fileDuplo2 = 5.80;
	static double alcatra2 = 6.80;
	static double picanha2 = 7.80;

	public static void main(String[] args) {

		System.out.println("===========================");
		System.out.println("   HIPERMERCADO TABAJARA");
		System.out.println("===========================");
		System.out.println();
		System.out.println("\tCAIXA ABERTO");

		Scanner sc = new Scanner(System.in);
		escolherCarne(sc);

	}

	public static void escolherCarne(Scanner sc) {

		System.out.println("\nTipo de carne: \n1.File duplo \n2.Alcatra \n3.Picanha");
		String escolhaCarne = sc.next();
		switch (escolhaCarne.toLowerCase()) {
		case "1", "File duplo":
			System.out.println("\nVocê escolheu File duplo ");
			pagamentoCarne(sc, "File duplo");
			break;
		case "2", "Alcatra":
			System.out.println("\nVocê escolheu Alcatra");
			pagamentoCarne(sc, "File duplo");
			break;
		case "3", "Picanha":
			System.out.println("\nVocê escolheu Picanha");
			pagamentoCarne(sc, "File duplo");
			break;
		default:
			System.out.println("Comando invalido");
			main(null);
			break;
		}

	}

	public static void pagamentoCarne(Scanner sc, String escolhaCarne) {

		double valorTotal = 0;
		System.out.println("\nQuantos quilos foi comprado:");
		double pesoCarne = sc.nextDouble();

		if (escolhaCarne.equals("File duplo")) {
			System.out.println("Você comprou " + pesoCarne + "KG File duplo.");
			if (pesoCarne <= 5.00) {
				valorTotal = Math.floor(pesoCarne * fileDuplo);
				System.out.println("\nVALOR TOTAL: R$" + valorTotal);
				escolherPagamento(sc,valorTotal, escolhaCarne, pesoCarne);
			} else if (pesoCarne >= 5.00) {
				valorTotal = Math.floor(pesoCarne * fileDuplo2);
				System.out.println("\nVALOR TOTAL: R$" + valorTotal);
				escolherPagamento(sc,valorTotal, escolhaCarne, pesoCarne);
			}
		} else if (escolhaCarne.equals("Alcatra")) {
			System.out.println("Você comprou " + pesoCarne + "KG Alcatra.");
			if (pesoCarne <= 5.00) {
				valorTotal = Math.floor(pesoCarne * alcatra);
				System.out.println("\nVALOR TOTAL: R$" + valorTotal);
				escolherPagamento(sc,valorTotal, escolhaCarne, pesoCarne);
			} else if (pesoCarne >= 5.00) {
				valorTotal = Math.floor(pesoCarne * alcatra2);
				System.out.println("\nVALOR TOTAL: R$" + valorTotal);
				escolherPagamento(sc,valorTotal, escolhaCarne, pesoCarne);
			}
		} else if (escolhaCarne.equals("Picanha")) {
			System.out.println("Você comprou " + pesoCarne + "KG Picanha.");
			if (pesoCarne <= 5.00) {
				valorTotal = Math.floor(pesoCarne * picanha);
				System.out.println("\nVALOR TOTAL: R$" + valorTotal);
				escolherPagamento(sc,valorTotal, escolhaCarne, pesoCarne);
			} else if (pesoCarne >= 5.00) {
				valorTotal = Math.floor(pesoCarne * picanha2);
				System.out.println("\nVALOR TOTAL: R$" + valorTotal);
				escolherPagamento(sc,valorTotal, escolhaCarne, pesoCarne);
			}
		} else {
			System.out.println("COMANDO INVALIDO");
			main(null);
		}
		
	}

	public static void escolherPagamento(Scanner sc, double valorTotal, String escolhaCarne, double pesoCarne) {

		double desconto = 0.05;
		double valorAPagar = valorTotal * desconto;
		System.out.println("\nEscolha a forma de pagamento.");
		System.out.println("1.DINHEIRO \n2.CARTÃO DE DEBITO \n3.CARTÃO DE CREDITO");
		String pagamento = sc.next();
		switch (pagamento.toLowerCase()) {
		case "1", "dinheiro":
			System.out.println("DINHEIRO");
			cupomFiscal(escolhaCarne, pesoCarne, valorTotal, pagamento, desconto);
			break;
		case "2", "debito":
			System.out.println("DEBITO");
			cupomFiscal(escolhaCarne, pesoCarne, valorTotal, pagamento, desconto);
			break;
		case "3", "credito":
			System.out.println("VOCÊ POSSUI O CARTÃO TABAJARA? (s/n)");
			String resposta = sc.next();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.println("R$" + desconto);
				cupomFiscal(escolhaCarne, pesoCarne, valorTotal, pagamento, desconto);
			} else {
				System.out.println("SEM DESCONTO.");
				cupomFiscal(escolhaCarne, pesoCarne, valorTotal, pagamento, desconto);
			}
			break;
		default:
			System.out.println("COMANDO INVALIDO");
			main(null);
			break;
		}

	}

	public static void cupomFiscal(String escolhaCarne, double pesoCarne, double valorTotal, String pagamento,
			double desconto) {

		double novoValor = valorTotal * desconto;
		double valorAPagar = valorTotal - novoValor;
		

		System.out.println("----- Cupom Fiscal -----");
		System.out.println();
		System.out.println("Tipo de Carne: " + escolhaCarne);
		System.out.println();
		System.out.println("Quantidade: " + pesoCarne);
		System.out.println();
		System.out.println("Preço Unitário: R$ " + valorTotal);
		System.out.println();
		System.out.println("Tipo de Pagamento: " + pagamento);
		System.out.println();
		System.out.println("Desconto: R$ " + novoValor);
		System.out.println();
		System.out.println("Valor a Pagar: R$ " + valorAPagar);
		System.out.println();
		
		novaCompra();
	}
	public static void novaCompra () {
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Deseja fazer uma nova compra(s/n)");
		String decisao = sc3.next();
		if (decisao.equalsIgnoreCase("s")) {
			System.out.println("Vamos iniciar nova compra.");
			escolherCarne(sc3);
		} else {
			System.out.println("OBRIGADO POR COMPRA NO HIPERMERCADO TABAJARA..");
		}

	}
	
}
