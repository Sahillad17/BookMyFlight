package com.bookmyflight.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="flights")
@SequenceGenerator(name = "flight_seq",sequenceName = "flight_seq",initialValue = 1001)
public class Flight {
	@Id
	@GeneratedValue(generator = "flight_seq",strategy=GenerationType.SEQUENCE)
	private int flightNumber;
	private String departure;
	private String arrival;
	@Column(name="flight_date")
	private LocalDate flightDate;
	@Column(name="arrival_time")
	private LocalTime arrivalTime;
	@Column(name="departure_time")
	private LocalTime departureTime;
	private double price; 
	private int availableSeats;
	private String airline;


	public Flight() {
		// TODO Auto-generated constructor stub
	}


	public Flight(int flightNumber, String departure, String arrival, LocalDate flightDate, LocalTime arrivalTime,
			LocalTime departureTime, double price, int availableSeats, String airline) {
		super();
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.arrival = arrival;
		this.flightDate = flightDate ;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.price = price;
		this.availableSeats = availableSeats;
		this.airline = airline;
	}


	public int getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getDeparture() {
		return departure;
	}


	public void setDeparture(String departure) {
		this.departure = departure;
	}


	public String getArrival() {
		return arrival;
	}


	public void setArrival(String arrival) {
		this.arrival = arrival;
	}


	public LocalDate getFlightDate() {
		return flightDate;
	}


	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}


	public LocalTime getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public LocalTime getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departure=" + departure + ", arrival=" + arrival
				+ ", flightDate=" + flightDate + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", price=" + price + ", availableSeats=" + availableSeats + ", airline=" + airline + "]";
	}
	
	
}
