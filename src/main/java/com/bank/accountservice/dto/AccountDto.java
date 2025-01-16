package com.bank.accountservice.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long accountNumber;
    private String accountType;
    private String bankAddress;
}
