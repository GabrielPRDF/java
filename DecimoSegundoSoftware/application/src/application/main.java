package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contratc;
import model.services.ContractService;
import model.services.PaypalService;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");;
		try {
			System.out.println("Entre os dados do contrato:");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.printf("Data (dd/MM/yyyy): ");
			LocalDate date = LocalDate.parse(sc.next(), sdf);
			System.out.print("Valor do contrato: ");
			double value = sc.nextDouble();
			System.out.print("Entre com o numero de parcelas: ");
			int parcelas = sc.nextInt();
			Contratc contratc = new Contratc(numero, date, value);
			ContractService contractService = new ContractService(new PaypalService());
			contractService.processContract(contratc, parcelas);
			System.out.println("Parcelas:");
			System.out.print(contratc);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
