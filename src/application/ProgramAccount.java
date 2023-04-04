package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.WhitdrawException;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Whitdraw limit: ");
		double limit = sc.nextDouble();
		
		System.out.println();
		Account acc = new Account(number, holder, balance, limit);
		System.out.print("Enter amount for whitdraw: ");
		
		try {
			acc.whitdraw(sc.nextDouble());
			System.out.printf("New balance: %.2f", acc.getBalance());
		} catch (WhitdrawException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
