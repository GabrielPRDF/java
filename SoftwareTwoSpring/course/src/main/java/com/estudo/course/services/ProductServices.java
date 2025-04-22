package com.estudo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.course.entities.Product;
import com.estudo.course.repositories.ProductRepository;

@Service
public class ProductServices  {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findId(Long id) {
		Optional <Product> obj = repository.findById(id);
		return obj.get();
	}
}
