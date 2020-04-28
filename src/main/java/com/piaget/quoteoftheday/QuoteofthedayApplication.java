package com.piaget.quoteoftheday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class QuoteofthedayApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteofthedayApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello World!");
	}

}
