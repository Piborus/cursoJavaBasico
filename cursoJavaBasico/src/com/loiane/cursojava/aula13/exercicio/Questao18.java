package com.loiane.cursojava.aula13.exercicio;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite o tamanho do arquivo: ");
		double tamArquivo = sc.nextDouble();

		System.out.print("\nDigite a sua velociade de internet: ");
		double tamInternet = sc.nextDouble();

		double tempo = tamArquivo / tamInternet;
		System.out.println("\nTempo de download: " + tempo);

	}

}
