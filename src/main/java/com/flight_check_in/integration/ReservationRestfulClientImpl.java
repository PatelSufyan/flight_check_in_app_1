package com.flight_check_in.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.flight_check_in.integration.dto.Reservation;
import com.flight_check_in.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation", request , Reservation.class);
		return reservation;
	}

}