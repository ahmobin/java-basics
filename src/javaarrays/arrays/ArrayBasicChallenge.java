package javaarrays.arrays;

import java.util.Scanner;

public class ArrayBasicChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] myInt = getIntegers(5);
        printArray(myInt);
//        sortIntegers(myInt);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " of integer");
        int[] values = new int[number];
        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array){
        for (int i =0; i<array.length; i++){
            System.out.println(i + " index of element value " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i = 0; i<array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for(int i =0; i<sortedArray.length; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
