package com.ito.carRental;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarBookingRepository extends CrudRepository<CarBooking,Integer>
{
public List<CarBooking> findBybookingid(Integer bookingid);
}
