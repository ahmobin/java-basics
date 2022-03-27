package abstraction;

public class RUser extends MobileUser{
    @Override
    void sendMessage() {
        System.out.println("Message send from RUser");
    }
}
