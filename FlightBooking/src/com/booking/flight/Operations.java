package com.booking.flight;

import java.util.Date;
import java.util.Scanner;

public class Operations {

	Scanner scan = new Scanner(System.in);
	String name, id, passport, nature;
	Date date;

	public void domestic() {
		// TODO Auto-generated method stub
		System.out.println("Enter Passenger Name: ");
		name = scan.nextLine();
		System.out.println("Enter the Passenger ID number");
		id = scan.nextLine();
		System.out.println("PLease state the nature of travel");
		nature = scan.nextLine();
		DomesticFlight df = new DomesticFlight(name, id, nature, new Date());
		System.out.println(df.toString()+"\n\n");
		;

	}

	public void international() {
		// TODO Auto-generated method stub
		System.out.println("Enter Passenger Name: ");
		name = scan.nextLine();
		System.out.println("Enter the Passenger ID number");
		id = scan.nextLine();
		System.out.println("PLease state the nature of travel");
		nature = scan.nextLine();
		System.out.println("Please enter the passport number");
		passport = scan.nextLine();
		InternationalFlight inf = new InternationalFlight(name, id, nature, passport, new Date());
		System.out.println(inf.toString() + "\n\n");
		;

	}

}
