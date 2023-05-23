package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota.");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota.");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota.");
		int nota3 = sc.nextInt();
		
		int media = (nota1 + nota2 + nota3) / 3;
		
		switch(media) {
		case 10 : System.out.println("Aprovado com distinção"); break;
		case 9 : System.out.println("Aprovado"); break;
		case 8 : System.out.println("Aprovado"); break;
		case 7 : System.out.println("Aprovado"); break;
		case 6 : System.out.println("Reprovado"); break;
		case 5 : System.out.println("Reprovado"); break;
		case 4 : System.out.println("Reprovado"); break;
		case 3 : System.out.println("Reprovado"); break;
		case 2 : System.out.println("Reprovado"); break;
		case 1 : System.out.println("Reprovado"); break;
		default : System.out.println("Opção invalida"); main(null);
		}
		System.out.println("Gostaria de continuar (s/n)");
		String resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			main(null);
		}
	}

}
