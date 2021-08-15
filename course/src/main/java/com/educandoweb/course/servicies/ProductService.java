package com.educandoweb.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository Repository;

	public List <Product> findAll(){
		return Repository.findAll();
	}
	
	public Product findById (Long id) {
		Optional <Product> obj = Repository.findById(id);
		return obj.get();
		
	}
	
	
}
