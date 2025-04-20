package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		

		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(1, "Roberto da Silva", "roberto@gmail.com");
		Pessoa p3 = new Pessoa(1, "Jose da Silva", "jose@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
