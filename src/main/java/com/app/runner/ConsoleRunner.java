package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	@SuppressWarnings("unused")
	@Autowired
	private ProductRepository repo;

	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("Samsung Galaxy S10+",6.2)) ;
		System.out.println(p.getProdId());
		repo.save(new Product("Sony Xperia XA2 Ultra",7.4));
		repo.save(new Product("Apple iPhone Xs Max",11.9));
		
		
	}

}
