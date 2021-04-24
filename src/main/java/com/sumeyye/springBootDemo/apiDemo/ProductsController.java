package com.sumeyye.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@GetMapping("/")
	public String get() {
		return "Merhaba";		
	}
	
	@GetMapping("/products")
	public String get2() {
		return "Laptop 4";
	}
}
