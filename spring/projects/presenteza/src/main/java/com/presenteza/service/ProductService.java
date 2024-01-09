package com.presenteza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.presenteza.entity.Product;

public interface ProductService {
	List<Product> findAllProducts();
}
