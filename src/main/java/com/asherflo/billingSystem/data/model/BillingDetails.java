package com.asherflo.billingSystem.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
public class BillingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    private String accountNumber;
    @Column(nullable = false)
    private String tariff;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public BillingDetails(Customer customer){
        this.accountNumber =String.valueOf(UUID.randomUUID().getLeastSignificantBits()).substring(1,11)+ "-01";
        this.customer= customer;

    }
    public  BillingDetails(){

    }


}
