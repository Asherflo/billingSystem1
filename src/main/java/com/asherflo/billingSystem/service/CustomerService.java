package com.asherflo.billingSystem.service;

import com.asherflo.billingSystem.data.exception.CustomerException;
import com.asherflo.billingSystem.data.model.Customer;
import com.asherflo.billingSystem.dtos.CustomerDto;
import com.asherflo.billingSystem.requestsAndResponses.AccountCreationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    CustomerDto createCustomer(AccountCreationRequest accountCreationRequest);
     Customer findCustomerById(Long id) throws CustomerException;
     List<Customer> findAll();

}
