package com.ito.carRental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class CarBooking {
	@Id
	@GeneratedValue
	private Integer bookingid;
	@Column
	@Temporal(TemporalType.DATE)
	private Date booking_startDate;
	@Column
	@Temporal(TemporalType.DATE)
	private Date booking_endDate;
	@Column
	private String booking_person_name;
	@Column
	private Long booking_person_contant_number;
	@Column
	private String booking_person_email;
	/*
	 * @OneToMany(mappedBy = "carBooking",cascade = CascadeType.ALL,fetch =
	 * FetchType.LAZY)
	 * 
	 * private List<Car> cars = new ArrayList<>();
	 * 
	 * 
	 * public List<Car> getCars() { return cars; }
	 * 
	 * public void setCars(List<Car> cars) { this.cars = cars; }
	 */
	@OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "bookingid")
    private List<Car> carDetails;
	
    public List<Car> getCarDetails() {
        return carDetails;
    }
    public void setCarDetails(List<Car> carDetails) 
    {
        this.carDetails = carDetails;
    }
	


	public Integer getBookingid() {
		return bookingid;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}

	public Date getBooking_startDate() {
		return booking_startDate;
	}

	public void setBooking_startDate(Date booking_startDate) {
		this.booking_startDate = booking_startDate;
	}

	public Date getBooking_endDate() {
		return booking_endDate;
	}

	public void setBooking_endDate(Date booking_endDate) {
		this.booking_endDate = booking_endDate;
	}

	public String getBooking_person_name() {
		return booking_person_name;
	}

	public void setBooking_person_name(String booking_person_name) {
		this.booking_person_name = booking_person_name;
	}

	public Long getBooking_person_contant_number() {
		return booking_person_contant_number;
	}

	public void setBooking_person_contant_number(Long booking_person_contant_number) {
		this.booking_person_contant_number = booking_person_contant_number;
	}

	public String getBooking_person_email() {
		return booking_person_email;
	}

	public void setBooking_person_email(String booking_person_email) {
		this.booking_person_email = booking_person_email;
	}

	

	
	

}
