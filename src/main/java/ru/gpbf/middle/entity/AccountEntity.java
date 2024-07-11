package ru.gpbf.middle.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigDecimal;
import java.util.UUID;

public final class AccountEntity {
    private UUID accountId;
    private String accountName;
    private BigDecimal amount;

    private AccountEntity() {
    }

    @JsonCreator
    public AccountEntity(UUID accountId, String accountName, BigDecimal amount) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
