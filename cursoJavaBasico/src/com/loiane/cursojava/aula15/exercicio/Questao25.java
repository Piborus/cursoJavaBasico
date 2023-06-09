package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao25 {

	static int pontoVitima = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao detector de crimes. \nOnde vamos descobrir quem matou o Zé da manga.");
		System.out.println("Digite seu nome, idade e genero(coloque os dados apenas entre virgula)");
		String cadastro = sc.nextLine();

		String[] listaSuspeitos = cadastro.split(",");

		if (listaSuspeitos.length == 3) {
			String nome = listaSuspeitos[0].trim();
			String idade = listaSuspeitos[1].trim();
			String genero = listaSuspeitos[2].trim();

			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Genero: " + genero);

			detector(sc);
		} else {
			System.out.println("Cadastro invalido");
			return;
		}

	}

	public static void detector(Scanner sc) {

		System.out.println("Vamos inciar.");
		System.out.println("Responda apenas sim ou não em cada pergunta.");

		System.out.println("1º PERGUNTA: Você telefonou para vitima?");
		String pergunta1 = sc.next();
		if (pergunta1.equalsIgnoreCase("sim")) {
			pontoVitima++;
		} else {
			pontoVitima = 0;
		}
		System.out.println("2º PERGUNTA: Esteve no local do crime?");
		String pergunta2 = sc.next();
		if (pergunta2.equalsIgnoreCase("sim")) {
			pontoVitima++;
		} else {
			pontoVitima = 0;
		}
		System.out.println("3º PERGUNTA: Mora perto da vitima?");
		String pergunta3 = sc.next();
		if (pergunta3.equalsIgnoreCase("sim")) {
			pontoVitima++;
		} else {
			pontoVitima = 0;
		}
		System.out.println("4º PERGUNTA: Devia para vitima?");
		String pergunta4 = sc.next();
		if (pergunta4.equalsIgnoreCase("sim")) {
			pontoVitima++;
		} else {
			pontoVitima = 0;
		}
		System.out.println("5º PERGUNTA: Você ja trabalhou para vitima?");
		String pergunta5 = sc.next();
		if (pergunta5.equalsIgnoreCase("sim")) {
			pontoVitima++;
		} else {
			pontoVitima = 0;
		}
		int resultado = pontoVitima;
		switch (resultado) {
		case 2:
			System.out.println("Suspeito");
			break;
		case 3:
			System.out.println("Cumplice");
			break;
		case 4:
			System.out.println("Cumplice");
			break;
		case 5:
			System.out.println("ASSASSINO PODE PRENDER.");
		default:
			System.out.println("Inocente pode liberar.");
			break;
		}

		/*
		 * if (resultado <= 2) { System.out.println("Suspeito"); } else if (resultado >=
		 * 3 && resultado <= 4) { System.out.println("Cúmplice"); } else if (resultado
		 * == 5) { System.out.println("ASSASSINO PODE PRENDER."); } else {
		 * System.out.println("Inocente pode liberar."); }
		 */
		System.out.println("Deseja continuar com outra pessoa (s/n)");
		String continuar = sc.next();
		if (continuar.equalsIgnoreCase("s")) {
			main(null);

		}
	}
}
