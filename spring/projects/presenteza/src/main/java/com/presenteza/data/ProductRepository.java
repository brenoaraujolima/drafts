package com.presenteza.data;

import java.util.List;

import com.presenteza.entity.Product;

public interface ProductRepository {

	List<Product> findAllProducts();
}
