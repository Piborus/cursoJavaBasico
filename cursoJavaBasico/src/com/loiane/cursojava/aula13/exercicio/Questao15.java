package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		System.out.println("Descubra quanto você perde para o governo.");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\nQuanto você ganha por hora?");
		double horaSalario = sc.nextDouble();
		
		System.out.println("\nQuantas horas você trabalha?");
		double horaTrabalhada = sc.nextDouble();
		
		System.out.println("\nQuantos dias trabalhados?");
		int diasTrabalhada = sc.nextInt();
		
		
		double totalSalario = (horaSalario * horaTrabalhada) / diasTrabalhada;
		
		System.out.println("\nO seu salario é de: " + "R$" + totalSalario);
		
		double ir = totalSalario * 11/100;
		System.out.println("\nVocê perdeu: R$" + ir + " para o INSS");
		double inss = totalSalario * 8/100;
		System.out.println("\nVocê perdeu: R$" + inss + " para o INSS");
		double sindicato = totalSalario * 5/100;
		System.out.println("\nVocê perdeu: R$" + sindicato + " para o INSS");
		
		double salarioLiquido =  ir - inss - sindicato;
		
		
		System.out.println("PARABENS O GOVERNO LEVOU R$ " + salarioLiquido);
		
		
		
		
	}

}
