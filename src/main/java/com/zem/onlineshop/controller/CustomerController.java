package com.zem.onlineshop.controller;

import com.zem.onlineshop.dao.CustomerDAO;
import com.zem.onlineshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    CustomerDAO customerDAO;

    @GetMapping("/customers")
    public String getCustomers(Model model){
        return "customer_list";
    }

//    @GetMapping("/customers/{customerId}")
//    public User getCustomer(Model model){
//        User user = customerDAO.findById(customerId);
//        model.addAt
//        return user;
//    }
//
//    @PostMapping("/customers")
//    public User addCustomer(@RequestBody User user){
//        user.setId(0);
//        customerDAO.save(user);
//        return user;
//    }
//
//    @PutMapping("/customers")
//    public User updateCustomer(@RequestBody User user){
//        customerDAO.save(user);
//        return user;
//    }
//
//    @DeleteMapping("/customers/{customerId}")
//    public String deleteCustomer(@PathVariable int  customerId){
//        User user = customerDAO.findById(customerId);
//        if(user == null){
//            throw new RuntimeException("User ID not Found " + customerId);
//        }
//        customerDAO.deleteById(customerId);
//        return "Deleted customer id - " + customerId;
//    }
}
