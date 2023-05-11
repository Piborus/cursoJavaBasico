package com.loiane.cursojava.aula13.exercicio;


import java.util.Scanner;

public class Questão17 {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo a TINTAS S.A");
		
		Scanner sc = new Scanner(System.in);
		
		double lataTinta = 18.00;
		double galaoTinta = 3.6;
		
		System.out.print("Digite o valor da área a ser pintada: ");
		double areaPintada = sc.nextDouble();
		
		double quantidadeTinta = (areaPintada * areaPintada) / Math.pow(6, 2);
		System.out.println("A quantidade de tinta necessaria é de: " + quantidadeTinta + " L");
		
		System.out.println("\nPronto. Agora escolha opção abaixo para o volume de tinta.");
		System.out.println("Digite 1 para compra galão de tinta de 3,6L.");
		System.out.println("Digite 2 para compra lata de tinta de 18L.");
		System.out.println("Digite 3 para compra galão e lata de tinta.");
		int op = sc.nextInt();
		
		if (op==1) {
			double precoTotal = (25 * quantidadeTinta) /galaoTinta;
			arredondar(precoTotal);
			System.out.println("Você gastou " + quantidadeTinta + " L" + " , no valor total de R$ " + precoTotal);
			
		}
		else if (op==2) {
			double precoTotal = (80 * quantidadeTinta) /lataTinta;
			arredondar(precoTotal);
			System.out.println("Você vai utilizar " + quantidadeTinta + " L" + " , no valor total de R$ " + precoTotal);
			
		}
		else if (op==3) {
			double precoTotal = (25 * quantidadeTinta) + (80 * quantidadeTinta) / galaoTinta + lataTinta;
			double precoTotalDesc = precoTotal * 0.010;
			arredondarDesc(precoTotalDesc);
			System.out.println("Você vai utilizar  " + quantidadeTinta + " L" + " , no valor total de R$ " + precoTotalDesc);
			
			
		}
		else if (op>3) {
			System.out.println("Opção invalida");
			System.out.close();
		}
		System.out.print("\nDeseja calcular novamente? (s/n): ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("s")) {
            main(null);
        }
		
		
	}

		private static double arredondar(double precoTotal) {
		   return Math.round(precoTotal * 100.0)/100.0;
		   
		}
		private static double arredondarDesc(double precoTotalDesc ) {
			   return Math.round(precoTotalDesc * 100.0)/100.0;
			   
			}
	}
