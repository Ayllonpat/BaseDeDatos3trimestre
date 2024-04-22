package com.salesianostriana.dam.ejemplospringcorebis;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service

public class SpanishSaludator implements{
		
		@PostConstruct
		void alComenzar() {
			
		}
		
		@PreDestroy
		void antesDeDestruir() {
			
		}

}
