package com.org.gen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCrudDemoApplicationTests {
	
	@Autowired
	ProductRepository repo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Product p=new Product();
		p.setId(3);
		p.setName("Samsung");
		p.setPrice(20000);
		repo.save(p);
		assertNotNull(repo.findById(3).get());
		
	}

	private void assertNotNull(Product product) {
		// TODO Auto-generated method stub
		
	}

}
