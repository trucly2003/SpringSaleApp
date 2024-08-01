/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nttl.service;

import com.nttl.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ly Nguyen
 */
public interface ProductService {
    List<Product> getProducts(Map<String, String> params);

    void addOrUpdate(Product p);

    Product getProductById(int Id);
}
