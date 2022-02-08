package javabasics.datatypes;

public class HelloJava {
    public static void main(String[] args){
        System.out.println("Hello World");

        int myValue = 10_000; // equal to 10000
        // Primitive Data Type - int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: "+ myMaxIntValue);
        System.out.println("Underflow Minimum Integer Value: " + (myMinIntValue - 1));
        System.out.println("Overflow Maximum Integer Value: " + (myMaxIntValue + 1));
        System.out.println("====================================");

        // Primitive Data Type - byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: "+ myMaxByteValue);
        System.out.println("====================================");

        // Primitive Data Type - short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: "+ myMaxShortValue);
        System.out.println("====================================");

        // Primitive Data Type - long
        long myLongValue = 10L; //L denoted/casting that it is a long type variable
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: "+ myMaxLongValue);
        System.out.println("Underflow Minimum Long Value: " + (myMinLongValue - 1));
        System.out.println("Overflow Maximum Long Value: " + (myMaxLongValue + 1));
        System.out.println("====================================");

        // Primitive Data Type - float
        float myFloatValue = 5.07f; //f is denoting/casting it to float type
        System.out.println(myFloatValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: "+ myMaxFloatValue);
        System.out.println("====================================");

        // Primitive Data Type - double
        double myDoubleValue = 5d; //d is denoting/casting it to double type
        System.out.println(myDoubleValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: "+ myMaxDoubleValue);
        System.out.println("====================================");

        // challenge - convert pound to kilogram
        double noOfPounds = 200d;
        double onePoundOfKilogram = 0.45359237d;
        double convertPoundToKilogram = noOfPounds * onePoundOfKilogram;
        System.out.println(convertPoundToKilogram);
        System.out.println("====================================");

        // Primitive Data Type - char
        char myChar = 'A'; //char data type contain a single character in a variable.
        char myCharUnicode = '\u0041'; // unicode character are also declared by char datatype
        System.out.println(myChar);
        System.out.println(myCharUnicode);
        System.out.println("====================================");

    }
}
