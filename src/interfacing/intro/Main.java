package interfacing.intro;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(123456789);
        myPhone.powerOn();
        myPhone.dial(123456789);
        myPhone.callPhone(123456789);
        myPhone.answer();
    }
}
