package com.example.hotel_app;

import com.example.hotel_app.rest.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HotelMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMainApplication.class, args);
	}
	@GetMapping("/welcome")
	public String[] getWelcomeMessages() {
		System.out.println("getWelcomeMessages method called");
		return WelcomeMessage.getWelcomeMessage();
	}

}


