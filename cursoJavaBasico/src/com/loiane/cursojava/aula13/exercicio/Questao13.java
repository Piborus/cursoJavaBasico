package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		System.out.println("\nCalculadora de peso ideal.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite 1 para feminino.");
		System.out.println("\nDigite 2 para masculino.");
		System.out.println("\nDigite 3 para não efetuar o calculo.");
		int sexo = sc.nextInt();
		int genero = sexo;
		
		if (genero == 1) {
			System.out.println("\nDigite a sua altura.");
			double altura = sc.nextDouble();
			
			double pesoIdealF = (62.1 * altura) - 44.7;
			System.out.println("O seu peso ideal é " + pesoIdealF + "Kg");
		
			System.out.println("\nDigite o seu peso atual:");
			double peso = sc.nextDouble();
			double imc = peso / (altura * altura);
			if((imc >= 15) && (imc <= 19.9)) {
				System.out.println("Você está magro " + imc);
			} else if ((imc >= 20) && (imc <= 24.9)){
				System.out.println("Você está eutrofico " + imc);
			} else if ((imc >= 25) && (imc <= 29.9)) {
				System.out.println("Você está pre-obeso " + imc);
			} else if ((imc >= 30) && (imc <= 34.9)){
				System.out.println("Você está obeso " + imc);
			} else {
				System.out.println("Muito obeso");
			}
			
		}
		else if (genero == 2) {
			System.out.println("\nDigite a sua altura.");
			double altura = sc.nextDouble();
			
			double pesoIdealM = (72.7 * altura) - 58;
			System.out.println("O seu peso ideal é " + pesoIdealM + "Kg");
			
			System.out.println("\nDigite o seu peso atual:");
			double peso = sc.nextDouble();
			double imc = peso / (altura * altura);
			if((imc >= 15) && (imc <= 19.9)) {
				System.out.println("Você está magro " + imc);
			} else if ((imc >= 20) && (imc <= 24.9)){
				System.out.println("Você está eutrofico " + imc);
			} else if ((imc >= 25) && (imc <= 29.9)) {
				System.out.println("Você está pre-obeso " + imc);
			} else if ((imc >= 30) && (imc <= 34.9)){
				System.out.println("Você está obeso " + imc);
			} else {
				System.out.println("Muito obeso");
			}
		
			}
		else if (genero == 3){
			System.out.println("Operação invalida");
			
			}
	
		 System.out.print("\nDeseja calcular novamente? (s/n): ");
	        String resposta = sc.next();
	        if (resposta.equalsIgnoreCase("s")) {
	            main(null);
	        }
	}

}
