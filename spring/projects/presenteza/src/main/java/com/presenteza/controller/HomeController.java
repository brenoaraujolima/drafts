package com.presenteza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.presenteza.data.ProductRepository;
import com.presenteza.entity.Product;

@Controller
public class HomeController {

	private final ProductRepository productRepository;

	@Autowired
	public HomeController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		List<Product> products = productRepository.findAllProducts();

		model.addAttribute("products", products);

		return "home";
	}
}
