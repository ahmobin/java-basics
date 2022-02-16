package javabasics.oop.classes;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String phoneNumber;

    public void depositFund(double balance){
        this.balance+= balance;
    }

    public void withdrawFund(double balance){
        if(this.balance >= balance){
            this.balance-= balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
