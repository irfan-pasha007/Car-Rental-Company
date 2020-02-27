package com.ito.carRental.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ito.carRental.Car;
import com.ito.carRental.CarBooking;
import com.ito.carRental.service.CarBookingService;

@RestController
public class BookingController 
{
	@Autowired
	CarBookingService carbookingservice;
	
	@PostMapping(path = "bookings/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer createbooking(@RequestBody CarBooking carbooking)
	{
		CarBooking c = carbookingservice.createBooking(carbooking);
		return c.getBookingid();
	}
	@RequestMapping(method = RequestMethod.GET, value = "/booking/{bookingid}")
	public Optional<CarBooking> getbookingdetails(@PathVariable Integer bookingid)
	{
		return carbookingservice.getBookingDetails(bookingid);

	}
}
