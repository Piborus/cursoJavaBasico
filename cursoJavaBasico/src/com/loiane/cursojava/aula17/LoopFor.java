package com.loiane.cursojava.aula17;

import java.util.Iterator;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor : " + i);
		}
		for (int i = 5; i > 0; i--) {
			System.out.println("\ni tem valor : " + i);
		}
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("O valor de i: " + i + " e o valor de j: " + j);
		}
		int count = 0;
		for (; count < 10;) {
			System.out.println("O valor de count: " + count);
			count += 2;
		}
		int cont = 0;
		for (; cont < 10;) {
			System.out.println("O valor é: " + cont);
			cont += 2;
		}
		for (int cont1 = 0; cont1 < 10; cont1 += 2) {
			System.out.println("O valor de cont: " + cont1);
		}
		int soma = 0;
		for (int i = 1; i < 10; soma += i++)
			System.out.println("O valor da soma: " + soma);
		
		for(int i = 0; i < 5; i++) 
			System.out.println("O valor de i: " + i);

	}

}