package com.ito.carRental.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ito.carRental.CarBooking;
import com.ito.carRental.CarBookingRepository;

@Service
public class CarBookingService 
{
	@Autowired
	CarBookingRepository repo;
	
	public CarBooking createBooking(CarBooking carbooking) 
	{
		return repo.save(carbooking);
	}

	public Optional<CarBooking> getBookingDetails(Integer bookingid) {
		
		return repo.findById(bookingid);
	}

	
}
