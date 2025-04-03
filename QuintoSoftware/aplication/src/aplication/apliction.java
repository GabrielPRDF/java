package aplication;

import java.util.Scanner;

import antities.Account;

public class apliction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberAccount;
		String name;
		Double value;
		Account account;

		System.out.println("Enter account holder");
		name = sc.nextLine();
		System.out.println("Enter account number");
		numberAccount = sc.nextInt();
		System.out.println("Is there na initial deposit (y/n)?");
		char rest = sc.next().charAt(0);
		
		if (rest == 'y' ) {
			System.out.println("Enter initial deposit value:");
			value = sc.nextDouble();
			account = new Account(name, numberAccount, value);
		} else {
			account = new Account(name, numberAccount);			
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.println("Enter the deposit value:");
		double newDeposit = sc.nextDouble();
		account.deposit(newDeposit);
		System.out.println();
		System.out.println(account);
		System.out.println();
		
		System.out.println("Enter the plunder value:");
		double newPlunter = sc.nextDouble();
		account.plunder(newPlunter);
		System.out.println();
		System.out.println(account);
		System.out.println();
		
		sc.close();
	}

}
