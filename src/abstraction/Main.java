package abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract class can have abstract or non abstract method.");
        System.out.println("For use abstract methods to a normal class that extends abstract class, must be override the abstract method otherwise the method should make abstract itself.");
        System.out.println("Abstract class cannot be instantiate, can create a reference variable and assign extended classes into it");
        System.out.println("==========================================\n");

        MobileUser mu;
        mu = new RUser();
        mu.sendMessage();
    }
}
