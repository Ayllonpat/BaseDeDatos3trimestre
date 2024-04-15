package com.salesianostriana.dam.ejemplospringcorebis;

import org.springframework.stereotype.Controller;

import jakarta.annotation.PostConstruct;

@Controller
public class MainDeMentira {

		@PostConstruct
		void run() {
			System.out.println("HolaMundo");
		}

}