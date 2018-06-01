package com.dk.product.dao;

import java.util.List;

import com.dk.product.model.ProductType;

public interface ProductTypeDao {
    List<ProductType> getProductTypes();
    int saveProductType(ProductType productType);
}
