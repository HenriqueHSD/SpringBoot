package com.coursejava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.course.entities.Product;
import com.coursejava.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> finAll(){
		return repository.findAll();
	}
	
	public Product findByid(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}