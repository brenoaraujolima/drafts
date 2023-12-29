package com.presenteza.entity;

public class Product {

	private int cdProduct;
	private String productName;

	public Product() {

	}

	public Product(int cdProduct, String productName) {
		this.cdProduct = cdProduct;
		this.productName = productName;
	}

	public int getCdProduct() {
		return cdProduct;
	}

	public void setCdProduct(int cdProduct) {
		this.cdProduct = cdProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
