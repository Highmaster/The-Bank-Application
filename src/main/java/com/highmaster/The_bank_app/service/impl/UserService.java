package com.highmaster.The_bank_app.service.impl;

import com.highmaster.The_bank_app.dto.BankResponse;
import com.highmaster.The_bank_app.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);

}
