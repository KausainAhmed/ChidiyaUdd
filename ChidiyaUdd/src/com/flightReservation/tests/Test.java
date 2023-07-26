package com.flightReservation.tests;

import com.flightReservation.dao.ReservationDao;
import com.flightReservation.dao.ReservationDaoImpl;
import com.flightReservation.model.Passenger;
import com.flightReservation.model.Reservation;

public class Test {
	public static void main(String[] args) {

		ReservationDao dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		Passenger p1 = new Passenger();
		p1.setId(123l);
		p1.setFirstName("Nihal");
		p1.setLastName("Ahmed");
		p1.setEmail("baignihal0765@gmail.com");
		reservation.setPassenger(p1);
		reservation.setFlightId(1l);

		Reservation savedReservation = dao.bookFlight(reservation);
		System.out.println(dao.bookFlight(reservation));

		Reservation checkedInReservation = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkedInReservation);

	}
}
