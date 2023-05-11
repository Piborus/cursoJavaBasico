package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite a sua idade.");
		 int idade = sc.nextInt();
		 
		 if(idade >= 18) {
			 System.out.println("Você é maior de idade.");
		 } else {
			System.out.println("Você não é maior de idade."); 
		 }

		 System.out.println("\nDigite um valor.");
		 double valor = sc.nextDouble();
		 
		 if(valor <= 10) {
			 System.out.println("Esta barato pode compra");
		 } else if (valor < 10 && valor < 15) {
			 System.out.println("Você pode pedir um desconto");
		 } else if (valor >= 15 && valor < 17) {
			 System.out.println("Pode pesquisar mais");
		 } else {
			 System.out.println("Muito caro.");
		 }
		 
	}

}
