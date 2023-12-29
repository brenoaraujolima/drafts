package com.presenteza;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.presenteza.entity.Product;

@SpringBootApplication
public class PresentezaApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(PresentezaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM product";
		List<Product> products = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(Product.class));

		products.forEach(p -> System.out.println(p.getProductName()));
	}

}
