package aplication;

import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
		int selecionado = 1;
		
		switch (selecionado) {
			case 0:
				exercicio1();
				break;
			case 1:
				exercicio2();
				break;
			default:
				break;
		}
		
		

	}

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
		
	}
}

