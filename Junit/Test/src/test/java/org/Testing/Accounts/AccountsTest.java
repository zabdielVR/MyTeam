/**
 * @version 0.1
 * @author Ittai Zabdiel
 * @Test
 * This test is a  example for Junit test core on java
 * This is only for example
 * This example not contaion bussines logic
 */
package org.Testing.Accounts;

import org.Testing.Banking.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {

    /***
     * First test for name and balance
     */
    @Test
    void name_accounts_type() {

        Accounts accounts = new Accounts("Jimmy",new BigDecimal("10000.23"));
        //accounts.setPerson("Jimmy");
        String response = "Jimmy";
        String buildTest = accounts.getPerson();
        Assertions.assertEquals(response,buildTest);

    }

    /***
     * Second test for name and balance with constructor
     */

    @Test
    void name() {
        Accounts accounts = new Accounts("Jimmy",new BigDecimal("10000.23"));
        //accounts.setPerson("Jimmy");
        String response = "Jimmy";
        String buildTest = accounts.getPerson();
        Assertions.assertEquals(response,buildTest);
        assertTrue(buildTest.equals("Jimmy"));

    }

    /***
     * Third test for check balance with  input decimal
     *
     */

    @Test
    void testBalance(){
        Accounts accounts = new Accounts("Test name" ,new BigDecimal("10000.23"));
        assertEquals(10000.23,accounts.getBalance().doubleValue());
    }

    /***
     *  Four test for check balance with balance ever positive
     */


    @Test
    void testBalancePositive(){
        Accounts accounts = new Accounts("Test name" ,new BigDecimal("10000.23"));
        assertEquals(10000.23,accounts.getBalance().doubleValue());
        assertFalse(accounts.getBalance().compareTo(BigDecimal.ZERO) < 0);
    }

    /***
     *  Five to check reference test
     */

    @Test
    void testReferenceAccount() {
        Accounts accounts1 = new Accounts("Bedu",new BigDecimal("99999.023"));
        Accounts accounts2 = new Accounts("Bedu",new BigDecimal("23499.023"));
        assertNotEquals(accounts1,accounts2);
    }

    /***
     *  Six test to check debit card with balance
     */

    @Test
    void testDebitCard(){
        Accounts accounts = new Accounts("Bedu",new BigDecimal("99999.023"));
        accounts.debitCard(new BigDecimal(100));
        assertNotNull(accounts.getBalance());
        assertEquals(300,accounts.getBalance().intValue());
        assertEquals("99999.023",accounts.getBalance().toPlainString());

    }


    /***
     *  Seven test to credit card
     */

    @Test
    void testCreditCard(){
        Accounts accounts = new Accounts("Bedu",new BigDecimal("99999.023"));
        accounts.creditCard(new BigDecimal(100));
        assertNotNull(accounts.getBalance());
        assertEquals(100,accounts.getBalance().intValue());
        assertEquals("99999.023",accounts.getBalance().toPlainString());

    }

    /***
     *  Eight test to check banking transfer
     */


    @Test
    void testWireTransfer(){
        Accounts accountsOrigin = new Accounts("Bedu" ,new BigDecimal("1000"));
        Accounts accountsDestiny = new Accounts("Bedu App" ,new BigDecimal("1000"));
        Bank bank = new Bank();
        bank.setNameBank("Test Bank");
        bank.wireTransfer(accountsDestiny,accountsOrigin,new BigDecimal(4000));
        assertEquals("5000",accountsOrigin.getBalance().toPlainString());
        assertEquals("5000",accountsDestiny.getBalance().toPlainString());

    }

}