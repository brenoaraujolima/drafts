package com.presenteza.repository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.presenteza.entity.Product;

@Repository
public class JdbcProductRepository {

	@Autowired
	private JdbcTemplate jdbc;

	@Autowired
	public JdbcProductRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public List<Product> findAllProducts() {
		String query = "SELECT * FROM product";
		List<Product> products = jdbc.query(query, BeanPropertyRowMapper.newInstance(Product.class));

		products.forEach(p -> System.out.println(p.getProductName()));

		return products;
	}
}
