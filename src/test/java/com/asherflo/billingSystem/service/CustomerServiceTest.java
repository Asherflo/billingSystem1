package com.asherflo.billingSystem.service;

import com.asherflo.billingSystem.data.model.enums.Gender;
import com.asherflo.billingSystem.dtos.CustomerDto;
import com.asherflo.billingSystem.requests.AccountCreationRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerServiceTest {

    private CustomerService customerService;

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
        accountCreationRequest.setFirstName("john");
        accountCreationRequest.setLastName("Doe");
        accountCreationRequest.setEmail("aniyikayetemitopeflorence@gmail.com");
        accountCreationRequest.setAddress("23,Adekunle adebosin,street,ikorodu");
        accountCreationRequest.setPassword("@asher123");
        accountCreationRequest.setGender(Gender.MALE);
        CustomerDto customerDto = customerService.createCustomer(accountCreationRequest);
        assertNotNull(customerDto);

    }



}