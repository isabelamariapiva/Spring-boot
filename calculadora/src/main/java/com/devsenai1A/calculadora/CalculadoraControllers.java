package com.devsenai1A.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculadoraControllers {

	@GetMapping("/somar")
	public double somar (@RequestParam double a,@RequestParam double b) {
		return a+b;
	}
	@GetMapping("/subtrair")
	public double subtrair (@RequestParam double a,@RequestParam double b) {
		return a+b;
	}
	@GetMapping("/multiplicar")
	public double multiplicr (@RequestParam double a,@RequestParam double b) {
		return a+b;
	}
	@GetMapping("/dividir")
	public double dividir (@RequestParam double a,@RequestParam double b) {
		return a+b;
	}
}
