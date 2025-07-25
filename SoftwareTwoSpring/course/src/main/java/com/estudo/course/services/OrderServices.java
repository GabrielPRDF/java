package com.estudo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.course.entities.Order;
import com.estudo.course.entities.User;
import com.estudo.course.repositories.OrderRepository;

@Service
public class OrderServices  {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findId(Long id) {
		Optional <Order> obj = repository.findById(id);
		return obj.get();
	}
}
