package com.educandoweb.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository Repository;

	public List <Category> findAll(){
		return Repository.findAll();
	}
	
	public Category findById (Long id) {
		Optional <Category> obj = Repository.findById(id);
		return obj.get();
		
	}
	
	
}
