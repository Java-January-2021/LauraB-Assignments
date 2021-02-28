package com.laura.productsandcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.laura.productsandcategories.models.Category;
import com.laura.productsandcategories.models.Product;
import com.laura.productsandcategories.services.CategoryService;
import com.laura.productsandcategories.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Product> products = productService.getAllProducts();
		List<Category> categories = categoryService.getAllCategories();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "index.jsp";
	}
	
	@RequestMapping("/new/product")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/create/product")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}
		productService.createProduct(product);
		return "redirect:/";
	}
	
	@RequestMapping("/new/category")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/create/category")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		}
		categoryService.createCategory(category);
		return "redirect:/";
	}
	
	@GetMapping("/product/{id}")
	public String showProduct(@PathVariable("id") Long id, Model model) {
		Product thisProduct = productService.getProduct(id);
		model.addAttribute("product", thisProduct);
		List<Category> categoryNotInProduct = categoryService.findCategoriesNotInProduct(thisProduct);
		model.addAttribute("catNotInProduct", categoryNotInProduct); //find correlation for catAssociation
		return "showProduct.jsp";
	}
	
	@PostMapping("/product/{id}")
	public String addCategoryToProduct(@RequestParam("category") Long categoryId, @PathVariable("id") Long productId) {
		Product thisProduct = productService.getProduct(productId);
		Category selectCategory = categoryService.getCategory(categoryId);
		productService.addCategoryToProduct(selectCategory, thisProduct);
		return "redirect:/product/" + productId;
	}
	
	@GetMapping("/category/{id}")
		public String showCategory(@PathVariable("id") Long id, Model model) {
			Category thisCategory = categoryService.getCategory(id);
			model.addAttribute("category", thisCategory);
			List<Product> productNotInCategory = productService.findProductsNotInCategory(thisCategory);
			model.addAttribute("prodNotInCategory", productNotInCategory); //find correlation for prodAssociation
			return "showCategory.jsp";
		}
	@PostMapping("/category/{id}")
		public String addProductToCategory(@RequestParam("product") Long prodId, @PathVariable("id") Long catId) {
		Category thisCategory = categoryService.getCategory(catId);
		Product selectProduct = productService.getProduct(prodId);
		categoryService.addProdToCategory(selectProduct, thisCategory);
		return "redirect:/category/" + catId;
	}

}
