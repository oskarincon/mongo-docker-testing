/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oscar.customer.service;

import com.oscar.customer.model.Customer;
import com.oscar.customer.repository.CustomerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author digital
 */
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
    
    //findAll customer
    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }
    
    
    //create customer
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    
    
    
}
