package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1; // pode utilizar o count ou cont
		int max = 10;

		System.out.println("A contagem de " + max);

		while (i <= max) {
			System.out.println("O valor de i: " + i);
			i++; // pode utilizar i = i+i; ou i += 1;
		}

		do {
			System.out.println("O valor de i: " + i);
			i++;
		} while (i <= 15);
	}

}
