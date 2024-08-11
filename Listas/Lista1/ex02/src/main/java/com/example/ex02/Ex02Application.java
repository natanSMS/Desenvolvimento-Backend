package com.example.ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex02Application {

	@GetMapping("/{quilometros}")
	public String exibirPreco(@PathVariable("quilometros") String quilometros) {
		double preco = calcularPreco(Double.parseDouble(quilometros));

		return "O preco final de sua expedicao eh: " + preco + " pratas";
	}
	

	public double calcularPreco(double quilometros) {
		final double precoPorQuilometro = 25;

		return quilometros * precoPorQuilometro;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex02Application.class, args);
	}

}
