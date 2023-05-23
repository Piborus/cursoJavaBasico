package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Identificador de triangulo.");
		System.out.print("Digite o primeiro valor: ");
		int lado1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		int lado2 = sc.nextInt();
		System.out.print("Digite o terceiro valor:");
		int lado3 = sc.nextInt();
		
		if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			System.out.println("Triangulo equilatero");
		} else if (lado1 == lado2 && lado2 != lado3 && lado1 != lado3 || lado2 == lado3 && lado1 != lado3 && lado1 != lado2 ) {
			System.out.println("Triangulo Isósceles");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Triangulo Escaleno");
		}
		main(null);
		
	}

}
