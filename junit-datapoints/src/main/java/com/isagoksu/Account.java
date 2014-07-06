package com.isagoksu;

import java.math.BigDecimal;

/**
 * Last update date: Jul 13, 2009, 10:10:35 PM
 *
 * @author isa
 * @version 1.0
 */
public class Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public Boolean withdraw(BigDecimal amount) {
        if (!hasEnoughBalance(amount)) {
            return false;
        }

        balance = balance.subtract(amount);
        return true;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public Boolean transfer(BigDecimal amount, Account toAccount) {
        if (!hasEnoughBalance(amount)) {
            return false;
        }

        balance = balance.subtract(amount);
        toAccount.deposit(amount);
        return true;
    }

    private Boolean hasEnoughBalance(BigDecimal amount) {
        return balance.compareTo(amount) >= 0;

    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}
