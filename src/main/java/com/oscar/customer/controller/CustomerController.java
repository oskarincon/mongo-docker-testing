/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oscar.customer.controller;

import com.oscar.customer.mapper.CustomerMapper;
import com.oscar.customer.model.Customer;
import com.oscar.customer.service.CustomerService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digital
 */
@RestController
@Slf4j
public class CustomerController {
    
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping("/getAllCustomer")
    public List<Customer> getAllCustomer(){
        log.info("initialize findCustomer : ");
        return customerService.findAllCustomer();
    }
    
    
    @PostMapping("/addCustomer")
    public ResponseEntity addCustomer(@RequestBody CustomerMapper customerM){
        log.info("initialize addCustomer : ", customerM);
        
        customerService.saveCustomer(customerM.toCustomer());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
}
