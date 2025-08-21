package com.techbank.account.query.api.queries;

import com.techbank.account.query.api.dto.EqualityType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountWithBalanceQuery {
    private EqualityType equalityType;
    private double balance;
}
