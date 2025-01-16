package com.bank.accountservice.service;

import com.bank.accountservice.dto.CustomerDto;
import com.bank.accountservice.entity.Customer;

public interface IAccountService {

    /**
     * @param customerDto - CustomerDto Object
     */

    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input mobileNumber
     * @return Account details based on a give number
     */
    CustomerDto fetchAccount(String mobileNumber);
}
