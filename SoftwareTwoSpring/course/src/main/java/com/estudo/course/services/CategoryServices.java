package com.estudo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.course.entities.Category;
import com.estudo.course.repositories.CategoryRepository;

@Service
public class CategoryServices  {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findId(Long id) {
		Optional <Category> obj = repository.findById(id);
		return obj.get();
	}
}
