package com.flightReservation.dao;

import java.util.HashMap;

import com.flightReservation.model.Flight;
import com.flightReservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {

	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;

	public ReservationDaoImpl() {
		reservations = new HashMap<>();
		flights = new HashMap<>();
		Flight f1 = new Flight();
		f1.setId(1l);
		f1.setFlightNumber("111");
		f1.setOperatingAirlines("indigo");
		f1.setDepartureCity("Mumbai");
		f1.setArrivalCity("Delhi");
		f1.setDateAndTimeOfDeparture("09/11/22 8AM");

		flights.put(f1.getId(), f1);

		Flight f2 = new Flight();
		f2.setId(2l);
		f2.setFlightNumber("121");
		f2.setOperatingAirlines("Go Air");
		f2.setDepartureCity("Lucknow");
		f2.setArrivalCity("Chandigarh");
		f2.setDateAndTimeOfDeparture("14/11/22 11AM");

		flights.put(f2.getId(), f2);
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId + 1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
		Reservation reservation = reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckedIn(true);
		return reservation;
	}

}
