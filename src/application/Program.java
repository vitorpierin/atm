package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BalanceException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		Account ac = new Account(number, holder, initialBalance, limit);
		System.out.print("Enter amount for withdraw:  ");
		double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);
		System.out.println("New balance: " + ac.getBalance());
		sc.close();
		}
		catch (BalanceException e) {
			System.out.println("Withdraw error:  " + e.getMessage());
		}
	
	
	}
}
