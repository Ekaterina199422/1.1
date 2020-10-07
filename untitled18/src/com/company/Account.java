package com.company;

import java.math.BigDecimal;

public class Account {
    private String number;
    private String owner;
    private BigDecimal amount;

    public Account(String number, String owner, BigDecimal amount) {
        this.number = number;
        this.owner = owner;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("Счет номер: %s, владелец: %s, сумма: %s", number, owner, amount);
    }
}