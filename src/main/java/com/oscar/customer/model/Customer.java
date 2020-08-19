/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oscar.customer.model;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author digital
 */
@Data
@Builder
@Document(collection = "Customer")
public class Customer {
    
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
