package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero correspondente ao dia da semana");
		int diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA");
			break;
		case 3:
			System.out.println("TERÇA");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("QUINTA");
			break;
		case 6:
			System.out.println("SEXTA");
			break;
		case 7:
			System.out.println("SABADO");
			break;
		default:
			System.out.println("Numero invalido");
			break;

		}
		main(null);
	}

}
