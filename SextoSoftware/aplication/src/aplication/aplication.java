package aplication;

import java.util.Locale;

import util.Vetores;

public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int selecionado = 10;
		
		switch (selecionado) {
			case 0:
				Vetores.exercicio1();
				break;
			case 1:
				Vetores.exercicio2();
				break;
			case 2:
				Vetores.exercicio3();
				break;
			case 3:
				Vetores.exercicio4();
				break;
			case 4:
				Vetores.exercicio5();
				break;
			case 5:
				Vetores.exercicio6();
				break;
			case 6:
				Vetores.exercicio7();
				break;
			case 7:
				Vetores.exercicio8();
				break;
			case 8:
				Vetores.exercicio9();
				break;
			case 9:
				Vetores.exercicio10();
				break;
			case 10:
				Vetores.exercicio11();
				break;
			default:
				break;
		}
	}
}