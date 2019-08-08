package com.ccm.learn.springboot.microservices.itemsservice.models.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ccm.learn.springboot.microservices.itemsservice.models.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public List<Item> findAll() {
		
		return null;
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		
		return null;
	}

}
