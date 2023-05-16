package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = sc.nextLine();

		switch (letra) {
		case "a", "A", "e", "E", "i", "I", "o", "O", "u", "U":
			System.out.println("Essa letra é uma vogal.");
			break;
		default:
			System.out.println("Essa letra é uma consoante.");
		}

	}

}
