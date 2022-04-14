package com.room.scp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.room.scp.entity.room_Booking;
import com.room.scp.exception.ResourceNotFoundException;
import com.room.scp.repository.room_BookingRepository;

@RestController
@RequestMapping("/api/roombookings")
public class room_BookingController {

	@Bean
    public WebMvcConfigurer getCorsConfiguration(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*/")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*");
            }
        };
    }
	
	
	@Autowired
	private room_BookingRepository room_bookingRepository;
	
	//Show all records
		@GetMapping("/all")
		public List <room_Booking> getAllBookings(){
			
			return this.room_bookingRepository.findAll();
		}
		
		// Show records by id
		@GetMapping("/{id}")
		public room_Booking getBookingById(@PathVariable (value = "id") long bookingId) {
			return this.room_bookingRepository.findById(bookingId).
					orElseThrow(() -> new ResourceNotFoundException("Booking not found with id :" + bookingId));
		}
		
		// Create record
		@PostMapping
		public room_Booking createBooking(@RequestBody room_Booking obj_booking) {
			
			return this.room_bookingRepository.save(obj_booking);
			
		}
		
		// Update record
		@PutMapping("/{id}")
		public room_Booking updateBooking(@RequestBody room_Booking obj_booking, @PathVariable("id") long ln_bookingId)
		{
			room_Booking existingbooking= this.room_bookingRepository.findById(ln_bookingId).
						orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: "+ln_bookingId));
			existingbooking.setFirstName(obj_booking.getFirstName());
			existingbooking.setroomRate(obj_booking.getroomRate());
			existingbooking.setLastName(obj_booking.getLastName());
			existingbooking.setCheckIn(obj_booking.getCheckIn());
			existingbooking.setCheckOut(obj_booking.getCheckOut());
			existingbooking.setRoomType(obj_booking.getRoomType());
			existingbooking.settotalPeople(obj_booking.gettotalPeople());
			existingbooking.setPrice(obj_booking.getPrice());
			existingbooking.settotalRoom(obj_booking.gettotalRoom());
			existingbooking.setEmail(obj_booking.getEmail());
			existingbooking.setPhone(obj_booking.getPhone());
			
			 return this.room_bookingRepository.save(existingbooking);
				
			
		}
		
		//Delete record
		@DeleteMapping("/{id}")
		public ResponseEntity<room_Booking> deleteBooking(@PathVariable ("id") long roomBookingId){
			
			room_Booking existing=this.room_bookingRepository.findById(roomBookingId).
					orElseThrow(() -> new ResourceNotFoundException("Booking not found with id :" + roomBookingId));
			
			this.room_bookingRepository.delete(existing);
			
			return ResponseEntity.ok().build();
		}
	
	
	
	

}