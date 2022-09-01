package com.asherflo.billingSystem.requestsAndResponses;

import com.asherflo.billingSystem.data.model.Customer;
import lombok.*;

import java.io.Serializable;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto implements Serializable {
    private String status;
    private String message;
    private Customer customer;
    private Object data;
}
