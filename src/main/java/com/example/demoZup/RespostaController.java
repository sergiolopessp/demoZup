package com.example.demoZup;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RespostaController {
	
	private final AtomicLong contador = new AtomicLong();
	
	@GetMapping("/retornaDados")
	public Resposta retornaDados() {
		return new Resposta(contador.incrementAndGet());
	}

}
