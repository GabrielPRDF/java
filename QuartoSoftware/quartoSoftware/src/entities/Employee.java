package entities;

import java.util.Scanner;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		this.grossSalary += this.grossSalary * percentage / 100;
		sc.close();
	}
	
	public void printSalary() {
		System.out.printf("%s, $ %.2f%n", name, netSalary());
	}
}
