package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit:: ");
			double withdraw = sc.nextDouble();
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			Account account = new Account(number, name, balance, withdraw);
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
			
		} catch (InputMismatchException e) {
			System.out.println("Input data incorrect!");
		} catch (AccountException e) {
			System.out.println(e.getMessage());
	    } catch (RuntimeException e) {
			System.out.println("Unexpected error: " + e);
		} finally {
			if(sc != null) {
				sc.close();				
			}
		}
	}

}
