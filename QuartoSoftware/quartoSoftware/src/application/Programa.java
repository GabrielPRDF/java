package application;

import java.util.Scanner;

import entities.Employee;
import entities.Retangulo;
import entities.Student;
import util.Cambio;

public class Programa {
	
	public static void main(String[] args) {
		int exercicio = 4;
		
		/*
		 * Exercicio 1
		 * Fazer um programa para ler os valores da largura e altura
		 * de um retângulo. Em seguida, mostrar na tela o valor de
		 * sua área, perímetro e diagonal. Usar uma classe como
		 * mostrado no projeto ao lado.
		 */
		if (exercicio == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Insert the height and width:");
			Retangulo x = new Retangulo();
			x.height = sc.nextDouble();
			x.width = sc.nextDouble();
			System.out.println("Area: " + x.area());
			System.out.println("Perimeter: " + x.perimetro());
			System.out.println("Diagonal: " + x.diagonal());
			sc.close();
		}
		
		/*
		 * Exercicio 2
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
		 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
		 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados 
		 * do funcionário. Use a classe projetada abaixo.
		 */
		if (exercicio == 2) {
			Scanner sc = new Scanner(System.in);
			Employee person = new Employee();
			System.out.println("Insert the name:");
			person.name = sc.nextLine();
			System.out.println("Insert the Gross salary:");
			person.grossSalary = sc.nextDouble();
			System.out.println("Insert Tax:");
			person.tax = sc.nextDouble();
			person.printSalary();
			person.increaseSalary();
			person.printSalary();
			sc.close();
		}
		
		/*
		 * Exercicio 3
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve 
		 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro 
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano.
		 * Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, 
		 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
		 * Você deve criar uma classe Student para resolver este problema.
		 */
		if (exercicio == 3) {
			Scanner sc = new Scanner(System.in);
			Student person = new Student();
			System.out.println("Insert the name:");
			person.nameAluno = sc.nextLine();
			System.out.println("Insert score 1:");
			person.tri1 = sc.nextDouble();
			System.out.println("Insert score 2:");
			person.tri2 = sc.nextDouble();
			System.out.println("Insert score 3:");
			person.tri3 = sc.nextDouble();
			person.resultado();
			sc.close();
		}
		
		/*
		 * Exercicio 4
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
		 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
		 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
		 * para ser responsável pelos cálculos.
		 */
		if (exercicio == 4) {
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the dollar price?");
			double dolar = sc.nextDouble();
			System.out.println("How many dollars will be bought?");
			double valorConversao = sc.nextDouble();
			System.out.println("Price IOF:" + Cambio.IOF);
			System.out.printf("Calcule: %.2f%n", Cambio.calculaValor(dolar, valorConversao));
			
		}
		
	}
}
