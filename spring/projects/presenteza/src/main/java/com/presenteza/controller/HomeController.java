package com.presenteza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.presenteza.entity.Product;
import com.presenteza.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	ProductService productService;

	@Autowired
	public HomeController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/")
	public String home(Model model) {
		List<Product> products = productService.findAllProducts();

		model.addAttribute("products", products);

		return "home";
	}
}
