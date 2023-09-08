package com.org.gen;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flipkart.com")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	//get,post,put,delete
	@PostMapping("/products")
	public ResponseEntity<Product> add(@RequestBody Product product) {
		Product p=service.save(product);
		return new ResponseEntity<>(p,HttpStatus.CREATED);
	}
	
	@GetMapping("/showProduct")
	public List<Product> list(){
		return service.listAll();
	}
	
	@PutMapping("pro/{id}")
    public ResponseEntity<?> update(@RequestBody Product product , @PathVariable int id){

        try {
            Product pro = service.get(id);
            pro.setName(product.getName());
            pro.setPrice(product.getPrice());
            service.save(pro);
           return new ResponseEntity<>(HttpStatus.OK);

        }catch (NoSuchElementException e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	
	@DeleteMapping("/del/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
            service.delete(id);
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        
    }
	
	

}
