/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service.impl;

import com.company.dao.inter.UserRepositoryCustom;
import com.company.entity.User;
import com.company.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author FarizHasanov
 */
@Service
@Transactional
public class UserServiceImpl implements UserServiceInter {

    @Autowired
    private UserRepositoryCustom userRepositoryCustom;

    @Override
    public List<User> getAll(String name, String surname, Integer nationalityId) {
        return userRepositoryCustom.getAll(name, surname, nationalityId);
    }

    @Override
    public boolean updateUser(User u) {
        return userRepositoryCustom.updateUser(u);
    }

    @Override
    public boolean removeUser(int id) {
        return userRepositoryCustom.removeUser(id);
    }

    @Override
    public User getById(int userId) {
        return userRepositoryCustom.getById(userId);
    }

    public boolean addUser(User u) {
        return userRepositoryCustom.addUser(u);

    }

//    @Override
//    public User findByEmailAndPasswordd(String email, String passwordd) {
//       return userRepositoryCustom.findByEmailAndPasswordd(email,passwordd);
//    }

    @Override
    public User findByEmail(String email) {
        return userRepositoryCustom.findByEmail(email);
    }

}
