package com.zem.onlineshop.dao;

import com.zem.onlineshop.entity.User;

import java.util.List;

public interface CustomerDAO {
    public List<User> findAll();
    public User findById(int id);
    public void save(User user);
    public void deleteById(int id);
}
