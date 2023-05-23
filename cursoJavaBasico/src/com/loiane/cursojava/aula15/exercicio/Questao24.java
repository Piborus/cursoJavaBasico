package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo a CALCULADORA");
		System.out.println("\nQual operação você deseja fazer fazer.");
		System.out.println("Digite 1 para soma.");
		System.out.println("Digite 2 para subtração.");
		System.out.println("Digite 3 para mutiplicação.");
		System.out.println("Dgite 4 para divisão.");
		System.out.println("Digite 5 para sair.");
		int op = sc.nextInt();

		System.out.println("A opção escolhida foi " + op);

		if (op == 5) {
			System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA.");
			return;

		} else if (op > 5) {
			System.out.println("Opção invalida.");
			main(null);
		}
		else {
			calculadora(sc, op);
		}

	}

	public static void calculadora(Scanner sc, int op) {

		System.out.println("Digite o primeiro valor.");
		double num1 = sc.nextDouble();

		System.out.println("Digite o segundo valor.");
		double num2 = sc.nextDouble();

		if (op == 1) {
			adicao(num1, num2);
			System.out.println("Deseja continuar (s/n)");
			String resposta1 = sc.next();
			if (resposta1.equalsIgnoreCase("s")) {
				main(null);
			} else {
				System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA.");
			}
		} else if (op == 2) {
			subtracao(num1, num2);
			System.out.println("Deseja continuar (s/n)");
			String resposta2 = sc.next();
			if (resposta2.equalsIgnoreCase("s")) {
				main(null);
			} else {
				System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA.");
			}
		} else if (op == 3) {
			multiplicacao(num1, num2);
			System.out.println("Deseja cotinuar (s/n)");
			String resposta3 = sc.next();
			if (resposta3.equalsIgnoreCase("s")) {
				main(null);
			} else {
				System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA.");
			}
		} else if (op == 4) {
			divisao(num1, num2);
			System.out.println("Deseja continuar (s/n)");
			String resposta4 = sc.next();
			if (resposta4.equalsIgnoreCase("s")) {
				main(null);
			} else {
				System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA.");
			}

		}
	}

	

	public static void adicao(double num1, double num2) {

		double soma = num1 + num2;

		System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);

		if (soma % 2 == 0) {
			System.out.println("\nEle é par");
		} else {
			System.out.println("\nEle é impar");
		}
		if (soma < 0) {
			System.out.println("\nEle é negativo.");
		} else {
			System.out.println("\nEle é positivo.");
		}

		if (Math.floor(soma) == soma) {
			System.out.println("\nEle inteiro.");
		} else {
			System.out.println("\nEle é decimal.");
		}
	}

	public static void subtracao(double num1, double num2) {

		double subtracao = num1 - num2;

		System.out.println("A subtração de " + num1 + " - " + num2 + " = " + subtracao);

		if (subtracao % 2 == 0) {
			System.out.println("\nEle é par.");
		} else {
			System.out.println("\nEle é impar.");
		}
		if (subtracao < 0) {
			System.out.println("\nEle é negativo.");
		} else {
			System.out.println("\nEle é positivo.");
		}
		if (Math.floor(subtracao) == subtracao) {
			System.out.println("\nEle é inteiro.");
		} else {
			System.out.println("\nEle é decimal");
		}
	}

	public static void multiplicacao(double num1, double num2) {

		double multiplicacao = num1 * num2;

		System.out.println("A multiplicação de " + num1 + " * " + num2 + " = " + multiplicacao);

		if (multiplicacao % 2 == 0) {
			System.out.println("\nEle é par.");
		} else {
			System.out.println("\nEle é impar.");
		}
		if (multiplicacao < 0) {
			System.out.println("\nEle é negativo.");
		} else {
			System.out.println("\nEle é negativo.");
		}
		if (Math.floor(multiplicacao) == multiplicacao) {
			System.out.println("\nEle é inteiro.");
		} else {
			System.out.println("\nEle é decimal.");
		}
	}

	public static void divisao(double num1, double num2) {

		double divisao = num1 / num2;

		System.out.println("A divisão de " + num1 + " / " + num2 + " = " + divisao);

		if (divisao % 2 == 0) {
			System.out.println("\nEle é par.");
		} else {
			System.out.println("\nEle é impar.");
		}
		if (divisao < 0) {
			System.out.println("\nEle é par.");
		} else {
			System.out.println("\nEle é impar.");
		}
		if (Math.floor(divisao) == divisao) {
			System.out.println("\nEle é inteiro.");
		} else {
			System.out.println("\nEle é decimal.");
		}

	}
}
