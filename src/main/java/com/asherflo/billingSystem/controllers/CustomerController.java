package com.asherflo.billingSystem.controllers;

import com.asherflo.billingSystem.data.exception.CustomerException;
import com.asherflo.billingSystem.data.model.Customer;
import com.asherflo.billingSystem.requestsAndResponses.AccountCreationRequest;
import com.asherflo.billingSystem.requestsAndResponses.CustomerDto;
import com.asherflo.billingSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    private  CustomerService customerService;


    @PostMapping("/createCustomer")
    public ResponseEntity<?>createCustomer(@RequestBody AccountCreationRequest accountCreationRequest){
        com.asherflo.billingSystem.dtos.CustomerDto customerDto = customerService.createCustomer(accountCreationRequest);
        CustomerDto apiResponses = CustomerDto.builder()
                .status("success")
                .message("Customer created successfully")
                .data(customerDto)
                .build();
        return new ResponseEntity<>(apiResponses, HttpStatus.CREATED);
    }
    @GetMapping("/id/{id}")
    public Customer findCustomerById( @PathVariable Long id) throws CustomerException{
        return customerService.findCustomerById(id);
    }

    @GetMapping("/all")
    public List<Customer> findAll(){
        return  customerService.findAll();

    }


}
