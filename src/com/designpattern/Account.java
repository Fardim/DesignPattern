package com.designpattern;

public class Account {
    public float getBalance() {
        return this.balance;
    }

    public void deposit(float amoumt) {
        if(amoumt>0){
            this.balance += amoumt;
        }
    }
    public void withdraw(float amount) {
        if (amount>0) {
            this.balance -= amount;
        }
    }
    private float balance;
}
