package com.vinaypinjani;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printMegaBytesAndKiloBytes(3500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        } else {
            int MBs = kiloBytes / 1024;
            int KBs = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + MBs + " MB and " + KBs + " KB");

        }
    }
}

