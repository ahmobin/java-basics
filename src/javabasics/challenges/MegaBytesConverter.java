package javabasics.challenges;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int kbToMb = kiloBytes / 1024;
        int remainingKB = kiloBytes - (kbToMb * 1024);
        System.out.println(kiloBytes + " KB = " + kbToMb + " MB and " + remainingKB + " KB");
    }
}
