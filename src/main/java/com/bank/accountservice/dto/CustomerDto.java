package com.bank.accountservice.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private String name;
    private String mail;
    private String mobileNumber;

    private AccountDto accountDto;
}
