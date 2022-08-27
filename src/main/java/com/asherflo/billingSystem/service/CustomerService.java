package com.asherflo.billingSystem.service;

import com.asherflo.billingSystem.dtos.CustomerDto;
import com.asherflo.billingSystem.requests.AccountCreationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    CustomerDto createCustomer(AccountCreationRequest accountCreationRequest);
     CustomerDto findCustomerById(String customerId);
     List<CustomerDto> findAll();

}
