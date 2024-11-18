package com.flight_check_in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_check_in.integration.ReservationRestfulClient;
import com.flight_check_in.integration.dto.Reservation;
import com.flight_check_in.integration.dto.ReservationUpdateRequest;


@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestfulClient restClient;
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
	}
	
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservation";
	}
	
	@RequestMapping("/proceedToCheckIn")
	public String startCheckIn(@RequestParam("id") Long id, @RequestParam("numberOfBags") int numberOfBags) {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberOfBags(numberOfBags);
		request.setCheckedIn(true);
		
		restClient.updateReservation(request);
		
		return "confirmReservation";
	}
	
}
