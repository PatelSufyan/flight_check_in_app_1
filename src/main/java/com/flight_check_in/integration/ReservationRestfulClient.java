package com.flight_check_in.integration;


import org.springframework.web.bind.annotation.RequestBody;

import com.flight_check_in.integration.dto.Reservation;
import com.flight_check_in.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {
	
	public Reservation findReservation(Long id);
	public Reservation updateReservation (@RequestBody ReservationUpdateRequest request);
	
}
