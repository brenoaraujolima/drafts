package com.presenteza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.presenteza.entity.Product;
import com.presenteza.repository.JdbcProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	JdbcProductRepository jdbcProductRepository;

	@Autowired
	ProductServiceImpl(JdbcProductRepository jdbcProductRepository) {
		this.jdbcProductRepository = jdbcProductRepository;
	}

	public List<Product> findAllProducts() {
		return jdbcProductRepository.findAllProducts();
	}

}
