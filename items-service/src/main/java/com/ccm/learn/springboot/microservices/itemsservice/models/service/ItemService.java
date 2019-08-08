package com.ccm.learn.springboot.microservices.itemsservice.models.service;

import java.util.List;

import com.ccm.learn.springboot.microservices.itemsservice.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);

}
