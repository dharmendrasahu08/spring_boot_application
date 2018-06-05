package com.dk.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.product.dao.ProductTypeDao;
import com.dk.product.model.ProductType;
import com.dk.product.service.ProductTypeService;

@Service
public class ProductTypeServiceImpl implements ProductTypeService{
	
	@Autowired
	private ProductTypeDao productTypeDao;

	public List<ProductType> getProductTypes() {
		return productTypeDao.getProductTypes();
	}
}
