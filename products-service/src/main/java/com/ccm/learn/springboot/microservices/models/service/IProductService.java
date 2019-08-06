package com.ccm.learn.springboot.microservices.models.service;

import java.util.List;

import com.ccm.learn.springboot.microservices.models.entity.Product;

public interface IProductService {
	
	public List<Product> findAll();
	
	public Product findById(Long id);

}