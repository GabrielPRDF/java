package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String strPath = "/Users/gabriel/code/Projetos Java/java/DecimoQuartoSoftware/arquivoTeste.csv";
		List<Employee> listEmployee = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();
			while (line != null) {
				String[] lineFormat = line.split(",");
				listEmployee.add(new Employee(lineFormat[0], lineFormat[1], Double.parseDouble(lineFormat[2])));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("Enter salary: ");
		double salaryCompare = sc.nextDouble();
		Comparator<String> comp = (n1, n2) -> n1.toUpperCase().compareTo(n2.toUpperCase());
		List<String> emails = listEmployee.stream()
				.filter(e -> e.getSalary() >= salaryCompare)
				.map(p -> p.getEmail())
				.sorted(comp.reversed())
				.collect(Collectors.toList());
		emails.forEach(System.out::println);
		Double sumSalary = listEmployee.stream()
				.filter(e -> e.getName().charAt(0) == 'M')
				.map(e -> e.getSalary())
				.reduce(0.0, (e, x) -> e + x);
		System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sumSalary));

	}

}
