package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\nBem vindo ao converso de medidas");
		
		System.out.println("\nDigite 1 para converte Metros para Centimentros.");
		System.out.println("Digite 2 para converte Centimentros para Metros.");
		int op = sc.nextInt();
		
		if (op == 1) {
			conversao1(op);
			return;
		}
		else if (op == 2) {
			conversao2(op);
		}		
	}
	
	public static void conversao1(int op) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu valor: ");
		double metro = sc.nextDouble();
		double conversao1 = metro * 100;
		System.out.println("Sua medida é: " + conversao1 + " cm");
		
		main(null);
	}
	
	public static void conversao2(int op) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu valor: ");
		double centimetro = sc.nextDouble();
		double conversao2 = centimetro / 100;
		System.out.println("Sua medida é: " + conversao2 + " m");
		
		main(null);
	}

}
