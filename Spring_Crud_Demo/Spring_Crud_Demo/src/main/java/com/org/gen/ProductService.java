package com.org.gen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll(){
		
		return repo.findAll();
	}
	public Product save(Product product) {
		return repo.save(product);
	}
	public Product get(int id) {
		return repo.findById(id).get();
	}
	public void delete(int id) {
		repo.deleteById(id);
	}

}
