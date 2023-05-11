package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		
		System.out.println("\nBem vindo ao termômetro");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite 1 para conversão em Farenheit para Celsius.");
		System.out.println("Digite 2 para conversão em Celsius para Farenheit.");
		System.out.println("Digite 3 para conversão em kelvin para Farenheit.");
		System.out.println("Digite 4 para conversão em kelvin para Celsius.");
		int op = sc.nextInt();
		
		if (op == 1) {
			System.out.println("Digite o numero:");
			double FC = sc.nextDouble();
			double tempCelsius = ((FC-32) / 1.8);
			System.out.println("Sua temperatura é " + tempCelsius + " °C");
			main(null);
		}
		else if (op == 2) {
			System.out.println("Digite o numero:");
			double CF = sc.nextDouble();
			double tempFarenheit = ((CF * 1.8) + 32);
			System.out.println("Sua temperatura é " + tempFarenheit + " °F");
			main(null);
		}
		else if (op == 3) {
			System.out.println("Digite o numero:");
			double KC = sc.nextDouble();
			double tempKelvin = KC - 273.15;
			System.out.println("Sua temperatura é " + tempKelvin + " °C");
			main(null);
		}
		else if (op == 4) {
			System.out.println("Digite o numero:");
			double CK = sc.nextDouble();
			double tempCk = CK + 273.15;
			System.out.println("Sua temperatura é " +  tempCk + " °K");
			main(null);
		}
	}

}
