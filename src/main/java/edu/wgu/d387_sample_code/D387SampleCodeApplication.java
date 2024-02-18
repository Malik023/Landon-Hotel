package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.rest.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);
	}
	@GetMapping("/welcome")
	public String[] getWelcomeMessages() {
		System.out.println("getWelcomeMessages method called");
		return WelcomeMessage.getWelcomeMessage();
	}

}
