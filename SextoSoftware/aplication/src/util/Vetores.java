package util;

import java.util.Scanner;

import entities.Pessoa;

public class Vetores {

	public static void exercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos números deseja inserir:");
		int n = sc.nextInt();
		int[] vector = new int[n];
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();
			System.out.println();
		}
		int x = 0;
		System.out.println("Números negativos:");
		while (x < vector.length) {
			if (vector[x] < 0) {
				System.out.println(vector[x]);
			}
			x++;
		}
		sc.close();
	}

	public static void exercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		int[] vector = new int[n];
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextInt();
			System.out.println();
		}
		int soma = 0, media = 0;
		System.out.print("VALORES = ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
			soma += vector[i];
		}
		System.out.println();
		System.out.print("SOMA = " + soma);
		System.out.println();
		System.out.print("MEDIA = " + soma / vector.length);
		sc.close();
	}

	public static void exercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		System.out.println();
		Pessoa[] vector = new Pessoa[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.println();
			vector[i] = new Pessoa(nome, idade, altura);
		}
		double somaAltura = 0.0;
		int somaMenor16 = 0;
		int i = 0;
		while(i < vector.length) {
			somaAltura += vector[i].getAltura();
			if (vector[i].getIdade() < 16) {
				somaMenor16++;
			}
			i++;
		}
		System.out.print("Altura média: " + String.format("%.2f", somaAltura / vector.length));
		System.out.println();
		System.out.println("Número de pessoa menores de 16: " + somaMenor16);
		System.out.print("Percentual de pessoas com menos de 16 anos: " + ((double) somaMenor16 / n) * 100);
		System.out.println();
		i = 0;
		while (i < vector.length) {
			System.out.println(vector[i].getNome());
			i++;
		}
		sc.close();
	}

	public static void exercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt(), pares = 0;
		int[] vector = new int[n];
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextInt();
		}
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				System.out.print(vector[i] + " ");
				pares++;
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + pares);
		sc.close();
	}

	public static void exercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt(), posicao = 0;
		double[] vector = new double[n];
		double valorMaior = 0.0;
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextDouble();
			if (vector[i] > valorMaior) {
				valorMaior = vector[i];
				posicao = i;
			}
		}
		System.out.print("MAIOR VALOR = " + String.format("%.1f", valorMaior));
		System.out.println();
		System.out.print("POSICAO DO MAIOR VALOR = " + posicao);
		sc.close();
		
	}

	public static void exercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		double[] vector1 = new double[n], vector2 = new double[n];
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = sc.nextDouble();
		}
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vector2.length; i++) {
			vector2[i] = sc.nextDouble();
		}
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < vector2.length; i++) {
			 System.out.println(vector1[i] + vector2[i]);
		}
		sc.close();
	}

	public static void exercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vector = new double[n];
		double valorTotal = 0.0, valorMedia = 0.0;
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextDouble();
			valorTotal += vector[i];
		}
		valorMedia = valorTotal / vector.length;
		System.out.print("MEDIA DO VETOR = " + String.format("%.3f", valorMedia));
		System.out.println();
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < valorMedia) {
				System.out.println(String.format("%.3f", vector[i]));
			}
		}
		sc.close();
	}
	
	public static void exercicio8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt(), valorTotal = 0, quantidade = 0;
		int[] vector = new int[n];
		double valorMedia = 0.0;
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextInt();
			if (vector[i] % 2 == 0) {
				valorTotal += vector[i];
				quantidade++;
			}
		}
		valorMedia = (double) valorTotal / quantidade;
		if (quantidade != 0) {
			System.out.print("MEDIA DO VETOR = " + String.format("%.1f", valorMedia));			
		} else {
			System.out.println("NENHUM NUMERO PAR!");
		}
		sc.close();
	}
}
