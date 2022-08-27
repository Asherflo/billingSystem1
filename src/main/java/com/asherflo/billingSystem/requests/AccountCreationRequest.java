package com.asherflo.billingSystem.requests;

import com.asherflo.billingSystem.data.model.enums.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCreationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String password;
    private String address;

}
