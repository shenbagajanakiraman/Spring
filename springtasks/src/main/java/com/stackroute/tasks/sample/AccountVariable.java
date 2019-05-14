package com.stackroute.tasks.sample;

public class AccountVariable {

    private int accNo;
    private String accName;

    public AccountVariable() {

    }

    public AccountVariable(int accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void m1 () {
        System.out.println("dsjfbewvyfgyewq");
    }

    @Override
    public String toString() {
        return "Account [ " +
                "accNo=" + accNo +
                ", accName='" + accName + '\'' +
                ']';
    }
}
