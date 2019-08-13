package com.ccm.learn.springboot.microservices.itemsservice.models.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.ccm.learn.springboot.microservices.itemsservice.clients.ProductRestClient;
import com.ccm.learn.springboot.microservices.itemsservice.models.Item;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private ProductRestClient productClientFeign;

	@Override
	public List<Item> findAll() {
		return productClientFeign.listar().stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(productClientFeign.detalle(id),cantidad);
	}
}
