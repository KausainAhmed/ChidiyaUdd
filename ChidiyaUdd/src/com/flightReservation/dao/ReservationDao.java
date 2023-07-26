package com.flightReservation.dao;

import com.flightReservation.model.*;

public interface ReservationDao {
	Reservation bookFlight(Reservation reservation);

	Reservation checkIn(long reservation, int noOfBags);
}
