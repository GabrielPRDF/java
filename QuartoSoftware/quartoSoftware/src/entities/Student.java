package entities;

public class Student {
	public String nameAluno;
	public double tri1;
	public double tri2;
	public double tri3;
	
	private double media() {
		return tri1 + tri2 + tri3;
	}
	
	public void resultado() {
		double resultadoMedia = media();
		System.out.println("Media do aluno: " + resultadoMedia);
		printResultado(resultadoMedia);
	}
	
	private void printResultado(double resultadoMedia) {
		if (resultadoMedia >= 60.0) {
			System.out.println("Pass!");			
		} else {
			System.out.println("Failed!");
			System.out.printf("Missing %.2f points!%n", 60.0 - resultadoMedia);
		}
	}
}
