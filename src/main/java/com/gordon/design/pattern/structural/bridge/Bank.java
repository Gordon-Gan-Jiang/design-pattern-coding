package com.gordon.design.pattern.structural.bridge;

/**
 * Created by Gordon.Gan
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
