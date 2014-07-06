package com.isagoksu;

import org.hamcrest.Matchers;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

/**
 * Last update date: Jul 13, 2009, 10:11:52 PM
 *
 * @author isa
 * @version 1.0
 */
@RunWith(Theories.class)
public class AccountTest {
    @DataPoint public static Account account1 = new Account(new BigDecimal("30"));
    @DataPoint public static Account account2 = new Account(new BigDecimal("3"));
    @DataPoint public static Account account3 = new Account(new BigDecimal("75"));
    @DataPoint public static Account account4 = new Account(new BigDecimal("90"));
    @DataPoint public static Account account5 = new Account(new BigDecimal("100"));

    @Theory
    public void testWithdraw(Account account) {
        assumeThat(account.getBalance(), Matchers.greaterThan(BigDecimal.TEN));
        assertTrue(account.withdraw(BigDecimal.TEN));
    }

    @Theory
    public void testTransferringMoney(Account johnDoe, Account janeDoe) {
        assumeThat(johnDoe.getBalance(), Matchers.greaterThan(new BigDecimal("25")));
        assertTrue(johnDoe.transfer(new BigDecimal("25"), janeDoe));
    }
}
