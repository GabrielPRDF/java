package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contratc;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println("Entre os dados do contrato:");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.printf("Data (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Valor do contrato: ");
			double value = sc.nextDouble();
			System.out.print("Entre com o numero de parcelas: ");
			int parcelas = sc.nextInt();
			Contratc contratc = new Contratc(numero, date, value);
		} catch (ParseException e) {
			System.out.println(e.getMessage());			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
