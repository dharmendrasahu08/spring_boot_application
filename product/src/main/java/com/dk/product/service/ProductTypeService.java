package com.dk.product.service;

import java.util.List;

import com.dk.product.model.ProductType;

public interface ProductTypeService {
	
	List<ProductType> getProductTypes();
	int saveProductType(ProductType productType);
}
