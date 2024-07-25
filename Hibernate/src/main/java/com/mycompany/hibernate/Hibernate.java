/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.hibernate;

import com.nttl.pojo.Cart;
import com.nttl.repository.impl.CategoryRepositoryImpl;
import com.nttl.repository.impl.ProductRepositoryImpl;
import com.nttl.repository.impl.ReceiptRepositoryImpl;
import com.nttl.repository.impl.StatsRepositoryImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ly Nguyen
 */
public class Hibernate {

    public static void main(String[] args) {
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));

        //test tạo ra một param
      //  Map<String, String> params = new HashMap<>();
      //  params.put("q", "iPhone");
      //  params.put("fromPrice", "28000000");
      //  params.put("page", "1");

//        ProductRepositoryImpl pro = new ProductRepositoryImpl();
//        pro.getProducts(params).forEach(p -> System.out.printf("%s - %.1f\n", p.getName(), p.getPrice()));
//          List<Cart> l = new ArrayList<>();
//          l.add(new Cart(1, "A", 2, 100l));

//            StatsRepositoryImpl s = new StatsRepositoryImpl();
//            s.statsRevenueByProduct().forEach(o -> System.err.printf("%d - %s: %d\n", o[0], o[1], o[2]));
//          
            StatsRepositoryImpl s = new StatsRepositoryImpl();
            s.statsRevenueByPeriod(2020, "quarter").forEach(o -> System.err.printf("%s: %d\n", o[0], o[1]));
//          ReceiptRepositoryImpl r = new ReceiptRepositoryImpl();
//          r.addReceipt(l);
    }
}
