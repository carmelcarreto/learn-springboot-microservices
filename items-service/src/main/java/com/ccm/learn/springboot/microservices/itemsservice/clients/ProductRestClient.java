package com.ccm.learn.springboot.microservices.itemsservice.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ccm.learn.springboot.microservices.itemsservice.models.Product;

@FeignClient(name="products-service", url="localhost:8001")
public interface ProductRestClient {

	@GetMapping("/listar")
	public List<Product> listar();
	
	@GetMapping("/ver/{id}")
	public Product detalle(@PathVariable Long id) {

	}
	
	
}
