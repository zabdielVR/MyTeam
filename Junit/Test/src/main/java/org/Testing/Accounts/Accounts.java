/**
 * @version 0.1
 * @author Ittai Zabdiel
 * @Class Accounts
 * This test is a  example for Junit test core on java
 * This is only for example
 * This example not contaion bussines logic
 */

package org.Testing.Accounts;

import java.math.BigDecimal;

public class Accounts {


    private String person;
    private BigDecimal balance;

    /***
     * Getter and Setters
     * @param person
     * @param balance
     */

    public Accounts(String person, BigDecimal balance) {
        this.person = person;
        this.balance = balance;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * Methods
     */

    public void debitCard(BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    public void creditCard(BigDecimal amount){
        this.balance = this.balance.subtract(amount);

    }


    /**
     * ToString metohd
     *
     */


    @Override
    public String toString() {
        return "Accounts{" +
                "person='" + person + '\'' +
                ", balance=" + balance +
                '}';
    }
}
