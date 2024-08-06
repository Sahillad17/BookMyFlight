package com.bookmyflight.entity;

import com.bookmyflight.enums.bookingstatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="flight_booking")
@SequenceGenerator(name="booking_seq",sequenceName = "booking_seq",initialValue = 2001)
public class Booking {
	@Id
	@GeneratedValue(generator = "booking_seq",strategy = GenerationType.SEQUENCE)
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="user_id")
	private int userId;
	@Column(name="flight_id")
	private int flightId;
	@Column(name="booking_date")
	private String bookingDate;
	@Column(name="passanger_name")
	private String passangerName;
	@Column(name="no_of_seat")
	private int noOfSeat;
	@Column(name="total_price")
	private double totalPrice;
	private bookingstatus status;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, int userId, int flightId, String bookingDate, String passangerName, int noOfSeat,
			double totalPrice, bookingstatus status) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.flightId = flightId;
		this.bookingDate = bookingDate;
		this.passangerName = passangerName;
		this.noOfSeat = noOfSeat;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public bookingstatus getStatus() {
		return status;
	}

	public void setStatus(bookingstatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", flightId=" + flightId + ", bookingDate="
				+ bookingDate + ", passangerName=" + passangerName + ", noOfSeat=" + noOfSeat + ", totalPrice="
				+ totalPrice + ", status=" + status + "]";
	}
	
	
}
