package javabasics.oop.classes;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }


    public BankAccount(String accountNumber, double balance, String customerName, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        System.out.println("params constructor called");
    }

    public void depositFund(double depositBalance){
        this.balance+= depositBalance;
    }

    public void withdrawFund(double withdrawalBalance){
        if(this.balance >= withdrawalBalance){
            this.balance-= withdrawalBalance;
        }else{
            System.out.println("Do not have sufficient balance");
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
