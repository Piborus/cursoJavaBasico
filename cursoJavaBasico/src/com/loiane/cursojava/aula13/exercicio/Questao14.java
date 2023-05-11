package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
	
		
		System.out.println("=============================");
		System.out.println("Calculadora fiscal do peixe.");
		System.out.println("=============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nDigite o peso do peixe em kg: ");
		double pesoPeixe = sc.nextDouble();
		
		if (pesoPeixe <= 50) {
			System.out.println("ZERO MULTA");	
		}
		else if (pesoPeixe > 50) {
			double excessoPeixe = pesoPeixe - 50;
			double multa = excessoPeixe * 4;
			System.out.println("\nA multa vai ser do valor de R$" + multa);	
		}
		System.out.print("\nDeseja calcular novamente? (s/n): ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("s")) {
            main(null);
        }
		
	}

}
