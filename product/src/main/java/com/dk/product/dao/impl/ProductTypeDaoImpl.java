package com.dk.product.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dk.product.dao.ProductTypeDao;
import com.dk.product.model.ProductType;


@Repository
public class ProductTypeDaoImpl implements ProductTypeDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<ProductType> getProductTypes() {
        Criteria criteria = sessionFactory.openSession().createCriteria(ProductType.class);
        return (List<ProductType>) criteria.list();
    }

    @Override
    public int saveProductType(ProductType productType) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        int id = (Integer) session.save(productType);
        tx.commit();
        session.close();
        return id;
    }

}
