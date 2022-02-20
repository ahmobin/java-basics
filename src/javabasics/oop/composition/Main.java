package javabasics.oop.composition;

public class Main {
    public static void main(String[] args){
        System.out.println("-----------Composition---------------");
        System.out.println("hasRelation with classes");
        System.out.println("-----------Composition---------------");

        System.out.println("\n");
        Dimension dimension = new Dimension(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimension);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-20", "Asus", 4,6,"v2.44");
        PC newPc = new PC(theCase, monitor, motherboard);
//        newPc.getMonitor().drawPixel(1500,1200,"red");
//        newPc.getMotherboard().loadProgram("windows 11");
//        newPc.getTheCase().pressPowerButton();
        newPc.powerUp();
    }
}
