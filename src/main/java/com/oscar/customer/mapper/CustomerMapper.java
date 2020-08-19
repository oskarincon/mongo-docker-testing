/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oscar.customer.mapper;

import com.oscar.customer.model.Customer;
import lombok.Data;

/**
 *
 * @author digital
 */
@Data
public class CustomerMapper {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    
    public Customer toCustomer(){
        return Customer.builder().firstName(firstName).lastName(lastName).email(email).phone(phone).build();
    }
}
