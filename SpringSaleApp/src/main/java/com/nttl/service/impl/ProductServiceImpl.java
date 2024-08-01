/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttl.service.impl;

import com.nttl.pojo.Product;
import com.nttl.repository.ProductRepository;
import com.nttl.service.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ly Nguyen
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductRepository ProRepo;
    
    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.ProRepo.getProducts(params);
    }

    @Override
    public void addOrUpdate(Product p) {
         this.ProRepo.addOrUpdate(p);
    }

    @Override
    public Product getProductById(int Id) {
        return this.ProRepo.getProductById(Id);
    }
    
}
