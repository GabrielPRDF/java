package aplication;

import java.util.Scanner;
import entities.Quartos;

public class aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos deve alugar? ");
		int n = sc.nextInt();
		Quartos[] vector = new Quartos[10];		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			System.out.println();
			String name = sc.next();
			System.out.print("Email: ");
			System.out.println();
			String email = sc.next();
			System.out.print("Room: ");
			int numero = sc.nextInt();
			vector[numero] = new Quartos(name, email, numero);
		}
		
		System.out.println("Quartos: ");
		for(int i = 0; i < 10; i++) {
			if (vector[i] != null) {
				System.out.println(vector[i]);
			}
		}
		sc.close();
	}



}
