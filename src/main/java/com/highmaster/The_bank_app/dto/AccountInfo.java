package com.highmaster.The_bank_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AccountInfo {

    private String accountName;
    private String accountBalance;
    private String accountNumber;
}
