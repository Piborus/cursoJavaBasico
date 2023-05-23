package com.loiane.cursojava.aula15.exercicio;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println("Calculadora de Folha de pagamento");
		System.out.println("=================================");

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor em horas do seu trabalho: ");
		double valorTrabalho = sc.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		double horaTrabalho = sc.nextDouble();

		double salarioBruto = valorTrabalho * horaTrabalho;
		System.out.println("O seu salario bruto é de R$ " + salarioBruto);

		if (salarioBruto <= 900.00) {
			System.out.println("\nIsento do Imposto de renda");
			double descontoInss = salarioBruto * 10 / 100;
			System.out.println("INSS: R$ " + descontoInss);
			double descontoFgts = salarioBruto * 11 / 100;
			System.out.println("FGTS: R$ " + descontoFgts);
			double descontoSindicato = salarioBruto * 3 / 100;
			System.out.println("SINDICATO: R$ " + descontoSindicato);

			double totalDescontos = descontoInss + descontoFgts + descontoSindicato;
			System.out.println("Total de descontos: R$ " + totalDescontos);

			double salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario liquido: R$ " + salarioLiquido);

		} else if (salarioBruto <= 1500.00){
			double descontoIr = salarioBruto * 5/100;
			System.out.println("\nImposto de renda: R$ " + descontoIr);
			double descontoInss = salarioBruto * 10 / 100;
			System.out.println("INSS: R$ " + descontoInss);
			double descontoFgts = salarioBruto * 11 / 100;
			System.out.println("FGTS: R$ " + descontoFgts);
			double descontoSindicato = salarioBruto * 3 / 100;
			System.out.println("SINDICATO: R$ " + descontoSindicato);

			double totalDescontos = descontoInss + descontoFgts + descontoSindicato;
			System.out.println("Total de descontos: R$ " + totalDescontos);

			double salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario liquido: R$ " + salarioLiquido);
			
		} else if (salarioBruto <= 2500.00) {
			double descontoIr = salarioBruto * 10/100;
			System.out.println("\nImposto de renda: R$ " + descontoIr);
			double descontoInss = salarioBruto * 10 / 100;
			System.out.println("INSS: R$ " + descontoInss);
			double descontoFgts = salarioBruto * 11 / 100;
			System.out.println("FGTS: R$ " + descontoFgts);
			double descontoSindicato = salarioBruto * 3 / 100;
			System.out.println("SINDICATO: R$ " + descontoSindicato);

			double totalDescontos = descontoInss + descontoFgts + descontoSindicato;
			System.out.println("Total de descontos: R$ " + totalDescontos);

			double salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario liquido: R$ " + salarioLiquido);
		} else {
			double descontoIr = salarioBruto * 20/100;
			System.out.println("\nImposto de renda: R$ " + descontoIr);
			double descontoInss = salarioBruto * 10 / 100;
			System.out.println("INSS: R$ " + descontoInss);
			double descontoFgts = salarioBruto * 11 / 100;
			System.out.println("FGTS: R$ " + descontoFgts);
			double descontoSindicato = salarioBruto * 3 / 100;
			System.out.println("SINDICATO: R$ " + descontoSindicato);

			double totalDescontos = descontoInss + descontoFgts + descontoSindicato;
			System.out.println("Total de descontos: R$ " + totalDescontos);

			double salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario liquido: R$ " + salarioLiquido);
		}
		System.out.println("Deseja continuar (s/n)");
		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("s")) {
			main(null);
		}
	}

}
