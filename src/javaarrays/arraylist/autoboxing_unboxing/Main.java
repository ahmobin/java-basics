package javaarrays.arraylist.autoboxing_unboxing;

public class Main {

    public static void main(String[] args){
        Bank bank = new Bank("EBL");
        bank.addBranch("Gulshan");

        bank.addCustomer("Gulshan","Mobin",50.00);
        bank.addCustomer("Gulshan","AH",59.05);
        bank.addCustomer("Gulshan","Tim",98.56);

        bank.addBranch("Mirpur");
        bank.addCustomer("Mirpur","John",98.41);

        bank.addCustomerTransaction("Gulshan","Mobin",25.00);
        bank.addCustomerTransaction("Gulshan","Mobin",20.01);
        bank.addCustomerTransaction("Mirpur","John",50.00);

        bank.listCustomers("Gulshan",true);
    }
}
