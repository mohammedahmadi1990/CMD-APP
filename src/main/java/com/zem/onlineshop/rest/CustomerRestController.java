package com.zem.onlineshop.rest;

import com.zem.onlineshop.dao.CustomerDAO;
import com.zem.onlineshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    private CustomerDAO customerDAO;

    @Autowired
    public CustomerRestController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @GetMapping("/customers")
    public List<User> findAll(){
        return customerDAO.findAll();
    }

    @GetMapping("/Customers/{customerId}")
    public User getCustomer(@PathVariable int customerId){
        User user = customerDAO.findById(customerId);
        if(user == null){
            throw new RuntimeException("Employee ID not Found - " + customerId);
        }
        return user;
    }

    @PostMapping("/Customers/{customerId}")
    public User addCustomer(@RequestBody User customer){
        customer.setId(0);
        customerDAO.save(customer);
        return customer;
    }

    @PutMapping("/Customers")
    public User updateCustomer(@RequestBody User customer){
        customerDAO.save(customer);
        return customer;
    }

    @DeleteMapping("/Customers/{customerId}")
    public String deleteCustomer(@PathVariable int  customerId){
        User user = customerDAO.findById(customerId);
        if(user == null){
            throw new RuntimeException("User ID not Found " + customerId);
        }
        customerDAO.deleteById(customerId);
        return "Deleted customer id - " + customerId;
    }
}
