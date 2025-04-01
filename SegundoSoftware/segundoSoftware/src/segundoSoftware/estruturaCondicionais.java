package segundoSoftware;
import java.util.Scanner;

public class estruturaCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		------ Exercicio 1
//		Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		System.out.println("Digite o número para comparação: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String validacao = (x < 0) ? "Negativo!": "Positivo!";
		System.out.printf("%s%n", validacao);
		sc.close();
		
//		------ Exercicio 2
//		Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		System.out.println("Digite o número para comparação: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String validacao = (x % 2 == 0) ? "Par!" : "Impar!";
		System.out.printf("%s%n", validacao);
		sc.close();
		
//		------ Exercicio 3
//		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//		ordem crescente ou decrescente.
		
		System.out.println("Digite o número para comparação: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String validacao = (y % x == 0) || (x % y == 0) ? "São multiplos!" : "Não são multiplos!";
		System.out.printf("%s%n", validacao);
		sc.close();
		
//		------ Exercicio 4
//		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		System.out.println("Digite o número para comparação: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (y < 24 && x < 24) {
			int calculo = (y > x) ? y - x : (24 - x) + y;
			System.out.printf("O jogo durou %d hora(s)!%n", calculo);			
		} else {
			System.out.println("Valores informado errados, podendo ser de 0 a 24!");
		}
		sc.close();
		
//		------ Exercicio 5
//		Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//		seguir, calcule e mostre o valor da conta a pagar.
		
		System.out.println("Digite o código e qunatidade: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		double valor;
		
		switch (x) {
			case 1:
				valor = 4.00;
				break;
			case 2:
				valor = 4.50;
				break;
			case 3:
				valor = 5.0;
				break;
			case 4:
				valor = 2.00;
				break;
			case 5:
				valor = 1.50;
				break;
			default:
				valor = 0;
				break;
		}
		double calculo = (double) y * valor;
		System.out.printf("Valor da compra: %.2f", calculo);			
	
		sc.close();
		
//		------ Exercicio 6
//		Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		System.out.println("Digite o valor de 0 a 100");
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		if (valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
		} else if (valor > 0 && valor < 25) {
			System.out.println("Intervalo [0-25]!");
		} else if (valor < 50) {
			System.out.println("Intervalo [25-50]!");
		} else if (valor < 75) {
			System.out.println("Intervalo [50-75]!");			
		} else if (valor < 100) {
			System.out.println("Intervalo [75-100]!");			
		}
		sc.close();
		
//		------- Exercicio 7
//		Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//		Se o ponto estiver na origem, escreva a mensagem “Origem”.
//		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//		situação
		
		System.out.println("Digite os dois pontos: ");
		Scanner sc = new Scanner(System.in);
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (x > 0) {
			if(y > 0) {
				System.out.println("Q1!");
			} else if (y < 0) {
				System.out.println("Q4!");
			} else {
				System.out.println("Sobre a linha X a direita!");				
			}
		} else if (x < 0) {
			if(y > 0) {
				System.out.println("Q2!");
			} else if (y < 0) {
				System.out.println("Q3!");
			} else {
				System.out.println("Sobre a linha X a esquerda!");				
			}
		} else {
			if(y > 0) {
				System.out.println("Sobre a linha Y a acima!");
			} else if (y < 0) {
				System.out.println("Sobre a linha Y a abaixo!");
			} else {
				System.out.println("Sobre a origem!");				
			}
		}
		sc.close();
		
//		------- Exercicio 8
//		Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//		duas casas decimais.
		
		System.out.println("Digite o valor: ");
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double calculo = 0.0;
		if (salario <= 2000) {
			
		} else if (salario >= 4500) {
			calculo += 1000 * 0.08;
			calculo += 1500 * 0.18;
			calculo += (salario - 4500) * 0.28;
		} else if (salario > 3000) {
			calculo += 1000 * 0.08;
			calculo += (salario - 3000) * 0.18;
		} else {
			calculo += (salario - 2000) * 0.08;
		}
		System.out.printf("Valor de imposto a pagar: R$ %.2f", calculo);
		sc.close();
	}

}
