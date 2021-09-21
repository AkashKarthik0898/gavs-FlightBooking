package com.booking.flight;

import java.util.Date;

public class InternationalFlight extends Flight {
	String passportNumber;

	public InternationalFlight(String name, String id, String nature, String passort, Date date) {
		// TODO Auto-generated constructor stub
		passportNumber = passort;
		super.passengerName = name;
		super.idProof = id;
		super.natureOfTravel = nature;
		super.dateOfTravel = date;

	}

	@Override
	public String toString() {
		return " The International Flight of Passenger " + passengerName + " with idProof=" + idProof
				+ " whose natureOfTravel is " + natureOfTravel + " is on " + dateOfTravel + "]";
	}

}
