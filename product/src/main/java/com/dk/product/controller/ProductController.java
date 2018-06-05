package com.dk.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dk.product.model.ProductType;
import com.dk.product.service.ProductTypeService;

@Controller
public class ProductController {

	@Autowired
	private ProductTypeService productTypeService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<ProductType>> userDetails() {
        
		List<ProductType> userDetails = productTypeService.getProductTypes();
		return new ResponseEntity<List<ProductType>>(userDetails, HttpStatus.OK);
	}

}
