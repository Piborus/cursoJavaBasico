package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para separa de centenas, dezenas e unidades.");
		int num = sc.nextInt();

		int centenas = num / 100;
		int dezenas = (num % 100) / 10;
		int unidades = ((num % 100) % 10);

		if (num >= 1000) {
			main(null);
		} else {
			System.out.println("O seu numero tem " + centenas + " centenas" + ", " + dezenas + " dezenas" + " e "
					+ unidades + " unidades. ");
			main(null);
		}
	}

}
