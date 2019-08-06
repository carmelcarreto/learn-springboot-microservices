package com.ccm.learn.springboot.microservices.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.ccm.learn.springboot.microservices.models.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long>{

}
