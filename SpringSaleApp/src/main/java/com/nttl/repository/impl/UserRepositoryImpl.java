///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.nttl.repository.impl;
//
//import com.mycompany.hibernate.HibernateUtils;
//import com.nttl.pojo.User;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//
///**
// *
// * @author Ly Nguyen
// */
//public class UserRepositoryImpl {
//    public User getUserByUsername(String username) {
//        try(Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createNamedQuery("User.findByUsername");
//            q.setParameter("username", username);
//            
//            return (User) q.getSingleResult();
//        }
//    }
//}
