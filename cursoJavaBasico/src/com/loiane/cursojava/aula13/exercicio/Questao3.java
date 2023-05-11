package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma de " + numero1 + "+" + numero2 + "=" + soma);
	}

}
