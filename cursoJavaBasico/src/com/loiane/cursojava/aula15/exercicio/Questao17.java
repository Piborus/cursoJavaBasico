package com.loiane.cursojava.aula15.exercicio;

import java.time.Year;
import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano e descubra se ele é bisssexto ou não.");
		int ano = sc.nextInt();

		Year year = Year.of(ano);
		boolean isLeapYear = year.isLeap();

		if (isLeapYear) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
	}

}
