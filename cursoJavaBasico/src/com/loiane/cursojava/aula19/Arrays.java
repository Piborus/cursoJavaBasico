package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double temDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		double tempDia006 = 32.8;
		double tempDia007 = 30;
		double tempDia008 = 29.8;
		double tempDia009 = 31.5;
		
		double[] temperaturas = new double [365];
		temperaturas [0] = 31.3;
		temperaturas [1] = 32;
		temperaturas [2] = 33.7;
		temperaturas [3] = 34;
		temperaturas [4] = 33.1;
		temperaturas [5] = 32.8;
		temperaturas [6] = 30;
		temperaturas [7] = 31.5;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		
		//Tamanho do Array (Quantas posições na memoria posso coloca nesse Array).
		System.out.println("O tamanho da array: " + temperaturas.length);
		
		//O valores do Array(O endereço de memoria em que esse Array está apontando).
		System.out.println("O valores do array " + temperaturas);
		
		//Todos os valores do Array.
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura dia " + (i+1) + " é " + temperaturas[i]);
		}
		
		//foreach.
		for(double temp : temperaturas) {
			System.out.println("O valor da temperatura dia " + (temp+1) + " é " + temp);
		}
		
	}

}
