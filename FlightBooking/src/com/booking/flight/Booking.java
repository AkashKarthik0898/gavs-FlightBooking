package com.booking.flight;

import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanInt = new Scanner(System.in);
		int choice;
		while (true) {
			Operations op = new Operations();
			System.out.println("Enter your choice of booking: 1-Domestic\t2-International\t3-Exit");
			choice = scanInt.nextInt();
			switch (choice) {
			case 1:
				op.domestic();
				break;
			case 2:
				op.international();
				break;
			case 3:
				scanInt.close();
				System.out.println("Operation terminated by user");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;

			}
		}

	}

}
