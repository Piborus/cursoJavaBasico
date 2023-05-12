package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questão16 {

	public static void main(String[] args) {
		
		System.out.println("Saiba quantos litros e o preço da sua tinta.");
		
		Scanner sc = new Scanner(System.in);
		
		double volumeTinta = 18.00;
		
		
		System.out.print("Digite o valor da área a ser pintada: ");
		double areaPintada = sc.nextDouble();
		
		double quantidadeTinta = (areaPintada * areaPintada) / Math.pow(3, 2);
		double precoTotal = (80 * quantidadeTinta) /volumeTinta;
		precoTotal = Math.round(precoTotal * 100)/100;
		
		System.out.println("Você gastou " + quantidadeTinta + "L" + " , no valor total de R$ " + precoTotal);	
	}

}
