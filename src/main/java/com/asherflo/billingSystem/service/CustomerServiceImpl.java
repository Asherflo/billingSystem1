package com.asherflo.billingSystem.service;

import com.asherflo.billingSystem.data.exception.CustomerException;
import com.asherflo.billingSystem.data.model.Customer;
import com.asherflo.billingSystem.data.repository.CustomerRepository;
import com.asherflo.billingSystem.dtos.CustomerDto;
import com.asherflo.billingSystem.requestsAndResponses.AccountCreationRequest;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService{


    private  CustomerRepository customerRepository;
    private  ModelMapper modelMapper;


    @Override
    public com.asherflo.billingSystem.dtos.CustomerDto createCustomer(AccountCreationRequest accountCreationRequest){
        Customer customer  = Customer.builder()
                .firstName(accountCreationRequest.getFirstName())
                .lastName(accountCreationRequest.getLastName())
                .address(accountCreationRequest.getAddress())
                .password(accountCreationRequest.getPassword())
                .dateJoined(LocalDate.now())
                .Email(accountCreationRequest.getEmail())
                .gender(accountCreationRequest.getGender())
                .build();
        Customer savedCustomer =customerRepository.save(customer);
//        return CustomerDto.builder()
//                .firstName(savedCustomer.getFirstName())
//                .lastName(savedCustomer.getLastName())
//                .email(savedCustomer.getEmail())
//                .build();
        return  modelMapper.map(savedCustomer, com.asherflo.billingSystem.dtos.CustomerDto.class);
    }

    @Override
    public Customer findCustomerById(Long customerId) throws CustomerException {

        return customerRepository.findById(customerId).orElseThrow(()->new CustomerException("customer does not exist"));
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
