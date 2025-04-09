package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a folder path: ");
//		String strPath = sc.nextLine();
		Locale.setDefault(Locale.US);
		String strPath = "/Users/gabriel/code/Projetos Java/java/DecimoPrimeiroSoftware/arquivoTeste.csv";
		List<Product> arrayList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();
			while (line != null) {
				String[] lineFormat = line.split(",");
				arrayList.add(new Product(lineFormat[0], Double.parseDouble(lineFormat[1]), Integer.parseInt(lineFormat[2])));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		for (Product obj : arrayList) {
			System.out.println(obj);
		}
		File path = new File(strPath);
		boolean success = new File(path.getParentFile() + "//out").mkdir();
		if(success) {
			System.out.println("Create folder!");
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParentFile() + "//out" + "//summary.csv"))) {
					for (Product obj : arrayList) {
						bw.write(obj.toString());
						bw.newLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
			}
		} else {
			System.out.println("Error creat folder!");
		}
	}

}
