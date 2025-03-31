import java.util.Locale;
import java.util.Scanner;

import javax.print.StreamPrintService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		------Apresentar dados no console, e variaveis------------
		
		System.out.println("Hellow word!");
		System.out.println("Good morning!");
		int y = 30;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		Locale.setDefault(Locale.US);	// Config local de execução do programa.
		System.out.printf("%.2f%n", x); // Config para definir 2 casas decimais depois do "." ou ",".
		System.out.printf("%.4f%n", x);	// Config para definir 4 casas decimais depois do "." ou ",".
		// Concatenações
		System.out.println("Resultado: " + x + " metros.");
		System.out.printf("Resultado: %.2f metros.%n", x);
		String nome = "Gabriel";
		int idade = 30;
		double valor = 13.000;
		System.out.printf("Concatenacao de %s e do %d e %.2f.%n", nome, idade, valor);

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n%s, which price is $ %.2f %n", product1, price1, product2, price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %c %n", age, code, gender);
		Locale.setDefault(Locale.US);
		System.out.printf("%nMeasue with eight decimal places: %.8f%nRouded (theree decimal places): %.3f%nUS decimal point: %.3f%n", measure, measure, measure);

		
		
//		---------Input de dados pelo terminal------
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor: ");
		Scanner sc = new Scanner(System.in);
//		String x = sc.next();
//		int x = sc.nextInt();
//		double x = sc.nextDouble();
//		char x = sc.next().charAt(0);
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		sc.close();
		System.out.printf("Valor digitado: %c%n", x);		
		System.out.printf("Valor digitado: %s%n", x);		
		System.out.printf("Valor digitado: %d%n", y);		
		System.out.printf("Valor digitado: %.2f%n", z);		

		System.out.println("Digite as 3 Strings: ");
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Digite os dados: ");
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

		
//		-----------Operação matematica--------------
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
//		------ Exercicio 1
//		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//		mensagem explicativa, conforme exemplos.
		
		System.out.println("Digite dois valores inteiros para somar:");
		Scanner sc = new Scanner(System.in);
		int valor1, valor2;
		valor1 = sc.nextInt();
		sc.nextLine();
		valor2 = sc.nextInt();
		System.out.printf("A soma do %d e %d é: %d", valor1, valor2, valor1 + valor2);
		sc.close();

		
//		------ Exercicio 2
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos.
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159
		
		System.out.println("Digite o raio do circulo: ");
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		System.out.printf("O valor da area do circulo é : %.4f", 3.14159 * (raio * raio));
		sc.close();

		
//		------ Exercicio 3
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		System.out.println("Digite 4 valores: ");
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		sc.nextLine();
		c = sc.nextInt();
		sc.nextLine();
		d = sc.nextInt();
		sc.nextLine();
		System.out.printf("Valor do produto de A e B por C e D: %d", (a * b) - (c * d));
		sc.close();

		
//		------ Exercicio 4
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//		decimais.
		
		System.out.println("Digite o codigo do funcionario, horas trabalhadas e base: ");
		Scanner sc = new Scanner(System.in);
		int codigo;
		double horas, base;
		codigo = sc.nextInt();
		sc.nextLine();
		horas = sc.nextDouble();
		sc.nextLine();
		base = sc.nextDouble();
		System.out.printf("Código: %d%nSalário: R$ %.2f", codigo, horas * base);
		sc.close();

	
//		------ Exercicio 5
//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		System.out.println("Digite o as pecas: ");
		Scanner sc = new Scanner(System.in);
		int cdPeca1, cdPeca2, nPeca1, nPeca2;
		double valorPeca1, valorPeca2;
		cdPeca1 = sc.nextInt();
		nPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		sc.nextLine();
		cdPeca2 = sc.nextInt();
		nPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		sc.close();
		double total = (nPeca1 * valorPeca1) + (nPeca2 * valorPeca2);
		System.out.printf("Valor a Pagar: R$ %.2f", total);
		sc.close();
		
//		------ Exercicio 6
//		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//		mostre:
//		a) a área do triângulo retângulo que tem A por base e C por altura.
//		b) a área do círculo de raio C. (pi = 3.14159)
//		c) a área do trapézio que tem A e B por bases e C por altura.
//		d) a área do quadrado que tem lado B.
//		e) a área do retângulo que tem lados A e B.
		
		System.out.println("Digite dados de A, B e C: ");
		Scanner sc = new Scanner(System.in);
		float a, b, c;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		sc.close();
		System.out.printf("Área do triangulo: %.2f%n", (a * c) / 2);
		System.out.printf("Área do circulo de raio C: %.2f%n", 3.14159 * c * c);
		System.out.printf("Área do trapézio: %.2f%n", ((a + b) * c) / 2);
		System.out.printf("Área do quadrado: %.2f%n", b * b);
		System.out.printf("Área do retângulo: %.2f%n", b * a);
		
	}
}
