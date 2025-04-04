package entities;

public class Student {
	private String name;
	private double nota1;
	private double nota2;
	
	public Student(String name, double nota1, double nota2) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public void aprovadoOuReprovado() {
		double media = (nota1 + nota2) / 2.0;
		if( media >= 6.0) {
			System.out.println(name);
		}
	}
}