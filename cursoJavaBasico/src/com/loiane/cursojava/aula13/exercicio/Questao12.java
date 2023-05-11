package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		System.out.println("\nVamos Calcular seu peso ideal.");

		Scanner sc = new Scanner(System.in);
		System.out.println("\nDigite a sua altura: ");
		double altura = sc.nextDouble();
		
		
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("\nO seu peso ideal é " + pesoIdeal + "Kg");
		main(null);
			
	}

}
