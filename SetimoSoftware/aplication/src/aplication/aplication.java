package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Quartos;

public class aplication {

	public static void main(String[] args) {
		int selecao = 0;
		if (selecao == 1) {
			logicaLista();
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite numero de linhas e de colunas:");
			int x = sc.nextInt(), y = sc.nextInt();
			System.out.println();
			int[][] matriz = new int[x][y];
			System.out.println("Digite os numeros:");
			for (int i = 0; i < matriz.length; i++) {
				for (int e = 0; e < matriz[i].length; e++) {
					matriz[i][e] = sc.nextInt();
				}
			}
			
			System.out.println();
			for (int i = 0; i < matriz.length; i++) {
				for (int e = 0; e < matriz[i].length; e++) {
					System.out.print(matriz[i][e] + " ");
				}
				System.out.println();
			}
			System.out.println();
			boolean valida = false;
			int posicaox = 0, posicaoy = 0;
//			do {
//				System.out.print("Posição: ");
//				posicaox = sc.nextInt();
//				posicaoy = sc.nextInt();
//				System.out.println();
//				if (posicaox >= 0 && posicaox < x && posicaoy <= y) {
//					printAdjacentes(posicaox, posicaoy, matriz);								
//				} else {
//					valida = true;
//				}
//			} while(valida == false);
			
			System.out.println("Digite o numero:");
			int numeroValida = sc.nextInt();
			for (int i = 0; i < matriz.length; i++) {
				for (int e = 0; e < matriz[i].length; e++) {
					if (matriz[i][e] == numeroValida) {
						System.out.println();
						printAdjacentes(i, e, matriz);
					}
				}
			}
			sc.close();
		}
		
	}
	
	public static void printAdjacentes(int posicaox, int posicaoy, int matriz[][]) {
		System.out.println(matriz[posicaox][posicaoy]);	
		System.out.println();
		if ((posicaox - 1) >= 0) {
			System.out.print("Up: " + matriz[posicaox - 1][posicaoy]);
			System.out.println();
		}
		if ((posicaox + 1) < matriz.length) {
			System.out.print("Down: " + matriz[posicaox + 1][posicaoy]);
			System.out.println();
		}
		if ((posicaoy - 1) >= 0) {
			System.out.print("Left: " + matriz[posicaox][posicaoy - 1]);
			System.out.println();
		}
		if ((posicaoy + 1) < matriz[posicaox].length) {
			System.out.print("Right: " + matriz[posicaox][posicaoy + 1]);
			System.out.println();
		}
	}
	
	public static void logicaLista() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt(), i = 0;
		List<Employee> lista = new ArrayList<>();
		System.out.println();
		while (i < n) {
			i++;
			System.out.println("Emplyoee #" + (i) + ":");
			System.out.print("Id: ");
			int number = sc.nextInt();;
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			lista.add(new Employee(number, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Double aumento = null;
		for (Employee objeto : lista) {
			if (objeto.getId() == id) {
				System.out.print("Enter the percentage: ");
				aumento = sc.nextDouble();
				objeto.addSalary(aumento);
			}
		}
		
		if(aumento == null) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee objeto : lista) {
			System.out.println(objeto);
		}
	}
	
	public static void exercicio0() {
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
