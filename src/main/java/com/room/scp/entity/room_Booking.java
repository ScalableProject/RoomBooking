package com.room.scp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table	(name="roomBooking")

public class room_Booking 
{
	// Column name of database
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		// Initialize variables of column name
		
		@Column(name="roomRate")
		private String roomRate;
		
		@Column(name="firstName")
	    private String firstName;
		
		@Column(name="lastName")
	    private String lastName;
		
		@Column(name="checkIn")
	    private String checkIn;
		
		@Column(name="checkOut")
	    private String checkOut;
		
		@Column(name="roomType")
	    private String roomType;
		
		@Column(name="totalPeople")
	    private String totalPeople;
		
		@Column(name="price")
	    private String price;
		
		@Column(name="totalRooms")
	    private String totalRooms;
		
		@Column(name="email")
	    private String email;
		
		@Column(name="phone")
	    private String phone;
		
		// Default constructor
		public room_Booking()
		{
			
		}
		
		//Parameterized constructor
		public room_Booking(String rr,String fname, String lname, String in,String out,String type, String totPeople, String rate, String totRoom,  String mail, String ph)
		{
			super();
			this.roomRate=rr;
			this.firstName = fname;
			this.lastName = lname;
			this.checkIn = in;
			this.checkOut = out;
			this.roomType = type;
			this.totalPeople = totPeople;
			this.price = rate;
			this.totalRooms=totRoom;
			this.email=mail;
			this.phone=ph;
		}
		
		// Get - Set methods for variables

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
	public String getroomRate() {
			return roomRate;
		}

		public void setroomRate(String rr) {
			this.roomRate = rr;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCheckIn() {
			return checkIn;
		}

		public void setCheckIn(String checkIn) {
			this.checkIn = checkIn;
		}

		public String getCheckOut() {
			return checkOut;
		}

		public void setCheckOut(String checkOut) {
			this.checkOut = checkOut;
		}

		public String getRoomType() {
			return roomType;
		}

		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}

		public String gettotalPeople() {
			return totalPeople;
		}

		public void settotalPeople(String totalP) {
			totalPeople = totalP;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}
		
		public String gettotalRoom() {
			return totalRooms;
		}

		public void settotalRoom(String totRoom) {
			this.totalRooms = totRoom;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		
		


}
