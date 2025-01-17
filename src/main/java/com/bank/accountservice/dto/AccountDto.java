package com.bank.accountservice.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AccountDto {
    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "(^$[0-9]{10})", message = "Mobile number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "AccountType cannot be null or empty")
    private String accountType;

    @NotEmpty(message = "bankAddress cannot be null or empty")
    private String bankAddress;
}
