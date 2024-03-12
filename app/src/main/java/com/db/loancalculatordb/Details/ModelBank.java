package com.db.loancalculatordb.Details;

import java.io.Serializable;

public class ModelBank implements Serializable {

    String name,number,balance,statement;

    public ModelBank(String name, String number, String balance, String statement) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.statement = statement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
