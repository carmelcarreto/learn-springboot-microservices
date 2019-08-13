package com.ccm.learn.springboot.microservices.itemsservice.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ccm.learn.springboot.microservices.itemsservice.models.Item;
import com.ccm.learn.springboot.microservices.itemsservice.models.Product;

@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> findAll() {
		List<Product> productos 
		= Arrays.asList(clienteRest.getForObject("http://products-service/listar",
				Product[].class));
		return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String ,String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Product product = clienteRest.getForObject("http://products-service/ver/{id}",
				Product.class, pathVariables);
		return new Item(product, cantidad);
	}

}
