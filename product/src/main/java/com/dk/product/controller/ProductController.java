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
    public ResponseEntity<List<ProductType>> getProductType() {
        
        List<ProductType> productTypes = productTypeService.getProductTypes();
        return new ResponseEntity<List<ProductType>>(productTypes, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public ResponseEntity<List<ProductType>> saveProductType() {
        ProductType proudctType = new ProductType();
        proudctType.setId(3);
        proudctType.setName("APPLE");
        proudctType.setDescription("DESCRIPTION APPLE");
        int id = productTypeService.saveProductType(proudctType);
        return new ResponseEntity(id, HttpStatus.OK);
    }

}
