package aplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Set<Integer> listA = new TreeSet<>(Arrays.asList(21, 35, 22));
//		Set<Integer> listB = new TreeSet<>(Arrays.asList(21, 50));
//		Set<Integer> listC = new TreeSet<>(Arrays.asList(42, 35, 13));
		Set<Integer> listA = new TreeSet<>(Arrays.asList());
		Set<Integer> listB = new TreeSet<>(Arrays.asList());
		Set<Integer> listC = new TreeSet<>(Arrays.asList());
		Set<Integer> listAlunosTratados = new HashSet<>();
		for (int i = 0; i < 3; i++) {
			System.out.printf("How many students for course " + choiceCh(i) + "? ");
			int number = sc.nextInt();
			while (number > 0) {
				number--;
				switch (i) {
					case 0:
						listA.add(sc.nextInt());
						break;
						
					case 1:
						listB.add(sc.nextInt());
						break;
						
					default:
						listC.add(sc.nextInt());
						break;
				}
			}
		}
		
		Set<Integer> listUnion = new TreeSet<>(listA);
		listUnion.addAll(listB);
		listUnion.addAll(listC);
		System.out.println("Turma A: " + listA);
		System.out.println("Turma B: " + listB);
		System.out.println("Turma C: " + listC);
		System.out.println("Todos os Alunos: " + listUnion);
		System.out.println("Quantidade de Alunos: " + listUnion.size());
		
		sc.close();
		
	}
	
	public static char choiceCh(Integer n) {
		char ch;
		switch(n) {
			case 0:
				ch = 'A';
				break;
				
			case 1:
				ch = 'B';
				break;
				
			default:
				ch = 'C';
				break;
		}
		return ch;
	}

}