package com.loiane.cursojava.aula15.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao26 {

	static double valorAlcool = 4.87;
	static double valorGasolina = 5.49;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("POSTO IPETANGOLO");

		System.out.println("Digite o numero da bomba de combustivel que irá utilizar.\n");
		System.out.println("BOMBA 1");
		System.out.println("BOMBA 2");
		System.out.println("BOMBA 3");

		int bombaCombustivel = sc.nextInt();
		System.out.println("Você irá utlizar a bomba " + bombaCombustivel);

		System.out.print("\nValor a receber para gasolina: ");
		double gasolinaReceber = sc.nextDouble();
		double litroGasolina = gasolinaReceber / valorGasolina;
		DecimalFormat df = new DecimalFormat("#.00");
		String litroGasolinaF = df.format(litroGasolina);
		System.out.println(litroGasolinaF);

		System.out.print("\nValor a receber para alcool: ");
		double alcoolReceber = sc.nextDouble();
		double litroAlcool = alcoolReceber / valorAlcool;
		DecimalFormat df1 = new DecimalFormat("#.00");
		String litroAlcoolF = df.format(litroAlcool);
		System.out.println(litroAlcoolF);

		double litroTotal = litroGasolina + litroAlcool;
		DecimalFormat df2 = new DecimalFormat("#.00");
		String litroTotalF = df.format(litroTotal);
		System.out.println("Total de litos: " + litroTotalF);

		if (litroGasolina <= 20) {
			double descontoG1 = litroGasolina * (valorGasolina * 4 / 100);
			DecimalFormat df3 = new DecimalFormat("#.00");
			String valorDescontoG = df.format(descontoG1);
			System.out.println("\nAplicando desconto 1: R$ " + descontoG1);
			double descontoTotal1 = gasolinaReceber - descontoG1;
			System.out.println("\nValor a receber: R$" + descontoTotal1);

		} else {
			double descontoG2 = litroGasolina * (valorGasolina * 5 / 100);
			DecimalFormat df3 = new DecimalFormat("#.00");
			String valorDescontoG = df.format(descontoG2);
			System.out.println("\nAplicando desconto 2: R$ " + descontoG2);
			double descontoTotal2 = gasolinaReceber - descontoG2;
			System.out.println("Valor a receber: R$" + descontoTotal2);
		}

		if (litroAlcool <= 20) {
			double descontoA1 = litroAlcool * (valorAlcool * 3 / 100);
			DecimalFormat df4 = new DecimalFormat("#.00");
			String valorDescontoA = df.format(descontoA1);
			System.out.println("\nAplicando desconto 1: R$ " + descontoA1);
			double descontoTotal1 = alcoolReceber - descontoA1;
			System.out.println("Valor a receber: R$" + descontoTotal1);
		} else {
			double descontoA2 = litroAlcool * (valorAlcool * 5 / 100);
			DecimalFormat df4 = new DecimalFormat("#.00");
			String valorDescontoA = df.format(descontoA2);
			System.out.println("\nAplicando desconto 2: R$ " + descontoA2);
			double descontoTotal2 = alcoolReceber - descontoA2;
			System.out.println("Valor a receber: R$" + descontoTotal2);

		}
		System.out.println("Iniciar nova operação(s/n)");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			main(null);
		} else {
			System.out.println("Encerrando operação.");
		}
	}

}
