/**
 * @version 0.1
 * @author Ittai Zabdiel
 * @Class Banking
 * This test is a  example for Junit test core on java
 * This is only for example
 * This example not contaion bussines logic
 */

package org.Testing.Banking;

import org.Testing.Accounts.Accounts;

import java.math.BigDecimal;

public class Bank {

    private String nameBank;

    public Bank(String nameBank) {
        this.nameBank = nameBank;
    }

    public Bank() {
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public void wireTransfer(Accounts origin , Accounts destiny  , BigDecimal ammount){
        origin.debitCard(ammount);
        destiny.debitCard(ammount);
    }
}
