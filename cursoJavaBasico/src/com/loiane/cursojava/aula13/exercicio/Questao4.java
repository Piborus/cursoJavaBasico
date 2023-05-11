package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 7) {
			System.out.println("Sua media é " + media + ". Você esta aprovado.");
		} else if(media < 7) {
			System.out.println("Sua media é " + media + ". Você esta reprovado.");
		}

	}

}
