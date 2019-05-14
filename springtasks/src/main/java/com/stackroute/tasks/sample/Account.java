package com.stackroute.tasks.sample;

public class Account {

    private AccountVariable accObj;

    public Account() {
    }

    public Account(AccountVariable accObj) {
        this.accObj = accObj;
    }

    public AccountVariable getAccObj() {
        return accObj;
    }

    public void setAccObj(AccountVariable accObj) {
        this.accObj = accObj;
    }

    public void message() {
        System.out.println("Just some Message first...\nAccount HolderName: " +accObj.getAccName()+"\nAccount Number: "+accObj.getAccNo());

        System.out.println(accObj);
    }

}
