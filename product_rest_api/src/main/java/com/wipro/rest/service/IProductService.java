package com.wipro.rest.service;


import java.util.List;

import com.wipro.rest.dto.ProductDTO;
import com.wipro.rest.entity.Product;

public interface IProductService {

	
	 public  Product   addProduct(ProductDTO productDTO);
	 
	 public  ProductDTO  getById(int pid);
	 
	 public List<Product>  getAllProducts();
	
	 public Product updateProduct(ProductDTO productDTO);
	
}
