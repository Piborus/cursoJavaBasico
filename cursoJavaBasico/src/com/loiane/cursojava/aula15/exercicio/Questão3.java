package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o seu genenro: F-feminino/M-masculino");
		String genero = sc.nextLine();
		
		switch(genero) {
		case "F", "feminino": System.out.print("genero feminino"); break;
		case "M", "masculino": System.out.print("genero masculino"); break;
		default: System.out.print("genero invalido"); 
		}		
	}
}
