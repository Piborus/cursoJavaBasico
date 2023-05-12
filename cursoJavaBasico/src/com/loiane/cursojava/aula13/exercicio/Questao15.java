package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {

		System.out.println("Descubra quanto você perde para o governo.");

		Scanner sc = new Scanner(System.in);

		System.out.println("\nQuanto você ganha por hora?");
		double horaSalario = sc.nextDouble();

		System.out.println("\nQuantas horas você trabalha?");
		double horaTrabalhada = sc.nextDouble();

		System.out.println("\nQuantos dias trabalhados?");
		int diasTrabalhada = sc.nextInt();

		double totalSalario = (horaSalario * horaTrabalhada) * diasTrabalhada;
		totalSalario = Math.round(totalSalario * 100) / 100;
		System.out.println("\nO seu salario é de: " + "R$" + totalSalario);

		double ir = totalSalario * 11 / 100;
		System.out.println("Você perdeu R$ " + ir + " para o imposto de renda");

		double inss = totalSalario * 8 / 100;
		System.out.println("Você perdeu R$ " + inss + " para o INSS.");

		double sindicato = totalSalario * 5 / 100;
		System.out.println("Você perdeu R$ " + sindicato + " para o sindicato.");

		double tributos = ir + inss + sindicato;
		tributos = Math.round(tributos * 100) / 100;

		System.out.println("PARABENS O GOVERNO LEVOU R$ " + tributos);

		double restoSalario = totalSalario - tributos;
		System.out.println("Restou apenas R$ " + restoSalario + " do seu salario.");

	}

}
