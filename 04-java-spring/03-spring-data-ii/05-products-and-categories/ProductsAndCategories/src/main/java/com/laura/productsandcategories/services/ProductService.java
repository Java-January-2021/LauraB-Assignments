package com.laura.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.productsandcategories.models.Category;
import com.laura.productsandcategories.models.Product;
import com.laura.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired 
	private ProductRepository productRepo;
	
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
	
	public Product createProduct(Product p) {
		return productRepo.save(p);
	}
	
	public Product getProduct(Long id) {
		return productRepo.findById(id).orElse(null);
	}
	
	public List<Product> findProductsNotInCategory(Category category) {
		return productRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategoryToProduct(Category category, Product product) {
		List<Category> selectedCategories = product.getCategories();
		selectedCategories.add(category);
		this.productRepo.save(product);
	}
}
