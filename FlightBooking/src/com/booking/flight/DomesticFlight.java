package com.booking.flight;

import java.util.Date;

public class DomesticFlight extends Flight {

	public DomesticFlight(String name, String id, String nature, Date date) {
		// TODO Auto-generated constructor stub
		super.passengerName = name;
		super.idProof = id;
		super.natureOfTravel = nature;
		super.dateOfTravel = date;
	}

	@Override
	public String toString() {
		return " The Domestic Flight of Passenger " + passengerName + " with idProof=" + idProof
				+ " whose natureOfTravel is " + natureOfTravel + " is on " + dateOfTravel + "]";
	}

}
