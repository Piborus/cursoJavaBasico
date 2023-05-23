package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		System.out.println("===================================================");
		System.out.println("Sistema de recursos humanos Organizações Tabajara.");
		System.out.println("===================================================");

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe  o seu salario bruto.");
		double salarioBruto = sc.nextDouble();

		if (salarioBruto <= 280.00) {
			System.out.println("O seu salario atual é de " + salarioBruto + " ," + " havera um aumento de 20%.");
			double aumentoSalario1 = salarioBruto * 20 / 100;
			double salarioNovo = salarioBruto + aumentoSalario1;
			System.out.println("O seu novo salario Bruto será no valor de " + salarioNovo + ".");
		} else if (salarioBruto > 280.00 && salarioBruto < 700.00) {
			System.out.println("O seu salario atual é de " + salarioBruto + " ," + " havera um aumento de 15%.");
			double aumentoSalario1 = salarioBruto * 15 / 100;
			double salarioNovo = salarioBruto + aumentoSalario1;
			System.out.println("O seu novo salario Bruto será no valor de " + salarioNovo + ".");
		} else if (salarioBruto > 700.00 && salarioBruto <= 1500.00) {
			System.out.println("O seu salario atual é de " + salarioBruto + " ," + " havera um aumento de 10%.");
			double aumentoSalario1 = salarioBruto * 10 / 100;
			double salarioNovo = salarioBruto + aumentoSalario1;
			System.out.println("O seu novo salario Bruto será no valor de " + salarioNovo + ".");
		} else {
			System.out.println("O seu salario atual é de " + salarioBruto + " ," + " havera um aumento de 5%.");
			double aumentoSalario1 = salarioBruto * 5 / 100;
			double salarioNovo = salarioBruto + aumentoSalario1;
			System.out.println("O seu novo salario Bruto será no valor de " + salarioNovo + ".");
		}
		System.out.println("Gostaria de continuar (s/n)");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			main(null);
		}

	}

}
