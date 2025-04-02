package terceiroSoftware;

import java.util.Scanner;

public class terceiroSoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		------ Exercicio 1
//		Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		do {
			System.out.println("Digite a senha: ");
			senha = sc.nextInt();
		} while(senha != 2002);
		sc.close();
		
//		------ Exercicio 2
//		Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		Scanner sc = new Scanner(System.in);
		double x, y;
		do {
			System.out.println("Digite as cordenadas:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			verificaCordenada(x, y);
		} while(x != 0 && y != 0);
		sc.close();
		
//		----- Exercicio 3
//		Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//		exemplo
		Scanner sc = new Scanner(System.in);
		int valorDigitado = 0;
		int somaAlcool = 0, somaGasolina = 0, somaDiesel = 0;
		do {
			System.out.println("Digite o código:");
			valorDigitado = sc.nextInt();
			switch (valorDigitado) {
				case 1:
					somaAlcool++;
					break;
				case 2:
					somaGasolina++;
					break;
				case 3:
					somaDiesel++;
					break;
				default:
					break;
			}
			
		} while (valorDigitado != 4);
		printaResultado(somaAlcool, somaGasolina, somaDiesel);
		sc.close();
		
//		------- Exercicio 1 folha 2
//		Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//		X, se for o caso.
		System.out.println("Digite o valor desejado:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), resultado;
		for (int i = 0; i <= x; i++) {
			resultado = (i % 2);
			if(resultado != 0) System.out.printf("Valor inpar: %d!%n", i);
		}
		sc.close();
		
//		------- Exercicio 2 folha 2
//		Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
//		System.out.println("Digite o quantidade de numeros:");
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt(), in = 0, out = 0, valor = 0;
//		for (int i = 0; i < x; i++) {
//			System.out.println("Digite o novo valor: ");
//			valor = sc.nextInt();
//			if (valor >= 10 && valor <= 20) {
//				in++;
//			} else {
//				out++;
//			}
//		}
//		System.out.printf("In %d%nout %d%n", in, out);
//		sc.close();
		
//		------ Exercicio 3 folha 2
//		Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//		peso 5.
		System.out.println("Digite o quantidade de numeros:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			double a, b, c;
			a = sc.nextDouble() * 2.0;
			b = sc.nextDouble() * 3.0;
			c = sc.nextDouble() * 5.0;
			System.out.printf("Média: %.1f%n", (a + b + c) / 10);
		}
		System.out.println("Fim!");
		sc.close();
		
//		------ Exercicio 4 folha 2
//		Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		System.out.println("Digite o quantidade de numeros:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			double a, b;
			a = sc.nextDouble();
			b = sc.nextDouble();
			if (b <= 0) {
				System.out.println("Divisão imposivel!");
			} else {
				System.out.printf("Divisão: %.1f%n", (a / b ));				
			} 
		}
		System.out.println("Fim!");
		sc.close();
		
//		------- Exercicio 5 folha 2
//		Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//		Lembrando que, por definição, fatorial de 0 é 1.
		System.out.println("Digite o numero:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), calculo = 1;
		for (int i = 1; i <= x; i++) {
			calculo = calculo * i;
		}
		System.out.printf("Calculo: %d!%n", calculo);
		sc.close();
		
//		------ Exercicio 6 folha 2
//		Ler um número inteiro N e calcular todos os seus divisores.
		System.out.println("Digite o numero:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			if ((x % i) == 0) {
				System.out.printf("Dividido por: %d%n", i);
			}
		}
		sc.close();
		
//		------- Exercicio7 folha 2
//		Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//		começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//		exemplo.
		System.out.println("Digite o numero:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		if (x <= 0) {
			System.out.println("Número invalido, encerrando programa!");
			return;
		}
		for (int i = 1; i <= x; i++) {
			System.out.printf("Valor: %d Ao quadrado: %d Ao cubo: %d%n", i, i * i, i * i * i);
		}
	}
	
	// Função do exercicio 2
	private static void verificaCordenada (double x, double y) {
		if (x > 0) {
			if (y > 0) {
				System.out.println("Quadrante 1!");
			} else if (y < 0) {
				System.out.println("Quadrante 2!");
			}
		} else if (x < 0 ) {
			if (x > 0) {
				if (y > 0) {
					System.out.println("Quadrante 4!");
				} else if (y < 0) {
					System.out.println("Quadrante 3!");
				}
			}
		}
	}
	
	// Função do exercicio 3
	private static void printaResultado(int alcool, int gasolina, int diesel) {
		System.out.println("\n\n\n\n\n"); // "Limpa"o console
		System.out.println("Muito Obrigado!");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
	}
}
