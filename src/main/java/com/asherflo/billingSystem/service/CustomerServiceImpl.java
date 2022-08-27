package com.asherflo.billingSystem.service;

import com.asherflo.billingSystem.dtos.CustomerDto;
import com.asherflo.billingSystem.requests.AccountCreationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto createCustomer(AccountCreationRequest accountCreationRequest) {
        return null;
    }

    @Override
    public CustomerDto findCustomerById(String customerId) {
        return null;
    }

    @Override
    public List<CustomerDto> findAll() {
        return null;
    }
}
