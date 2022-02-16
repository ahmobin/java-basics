package javabasics.oop.classes;

public class Main {
    public static void main(String[] args){
        //car
        Car porsche = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model name is " + porsche.getModel());

        //calculator
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());

        //bank account
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("0156985657456");
        bankAccount.setCustomerName("Account Holder");
        bankAccount.setPhoneNumber("01678965412");
        bankAccount.setBalance(0);
        System.out.println("the account balance of " + bankAccount.getCustomerName() + "(" + bankAccount.getAccountNumber() + ") : " + bankAccount.getBalance());
        bankAccount.depositFund(50000);
        System.out.println("the account balance of " + bankAccount.getCustomerName() + "(" + bankAccount.getAccountNumber() + ") : " + bankAccount.getBalance());
        bankAccount.withdrawFund(5000);
        System.out.println("the account balance of " + bankAccount.getCustomerName() + "(" + bankAccount.getAccountNumber() + ") : " + bankAccount.getBalance());
    }
}
