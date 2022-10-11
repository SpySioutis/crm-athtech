package org.example.model;

import java.math.BigDecimal;

public class Customer extends Person {

    private int customer;
    private BigDecimal balance;

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }



}
