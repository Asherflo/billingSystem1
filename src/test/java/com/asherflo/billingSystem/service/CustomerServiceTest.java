package com.asherflo.billingSystem.service;

import com.asherflo.billingSystem.data.exception.CustomerException;
import com.asherflo.billingSystem.data.model.Customer;
import com.asherflo.billingSystem.data.model.enums.Gender;
import com.asherflo.billingSystem.data.repository.CustomerRepository;
import com.asherflo.billingSystem.requestsAndResponses.AccountCreationRequest;
import com.asherflo.billingSystem.requestsAndResponses.CustomerDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("create a Customer")
    void testThatACustomerCanBeTested(){
        AccountCreationRequest accountCreationRequest = new AccountCreationRequest();
        accountCreationRequest.setFirstName("Asher");
        accountCreationRequest.setLastName("Glory");
        accountCreationRequest.setEmail("god'sson@gmail.com");
        accountCreationRequest.setAddress("31,precious holy spirit,ikorodu");
        accountCreationRequest.setPassword("1111");
        accountCreationRequest.setGender(Gender.FEMALE);
        com.asherflo.billingSystem.dtos.CustomerDto customerDto = customerService.createCustomer(accountCreationRequest);
        assertNotNull(customerDto);
    }
    @Test
    @DisplayName("Retrieve A Customer")
    void testThatACustomerCanBeFindById() throws CustomerException {
        Customer customer = customerService.findCustomerById(2L);
        assertEquals("Asher",customer.getFirstName());

    }
    @Test
    @DisplayName("Retieve all customers")
    void testThatAllCustomerCanBeFind(){
        List<Customer> customer = customerService.findAll();
        assertEquals(3,customerRepository.count());

    }

    }
    



