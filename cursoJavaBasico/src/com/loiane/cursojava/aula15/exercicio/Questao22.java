package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Coloque um numero e descubra se é par ou impar");
		int parImpar = sc.nextInt();
		
		if (parImpar % 2 == 0) {
			System.out.println("Seu numero é par.");
			main(null);
		} else if (parImpar %1 == 0) {
			System.out.println("Seu numero é impar.");
			main(null);
		}

	}

}
