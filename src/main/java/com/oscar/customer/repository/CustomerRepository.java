/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oscar.customer.repository;

import com.oscar.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author digital
 */

public interface CustomerRepository extends MongoRepository<Customer, Integer>{
    
}
