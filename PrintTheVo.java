/*
Name: Brian Vo
Date: September 19, 2026
Academic Integrity: I swear I wrote all this code by myself and that I did not plagiarize and or use unauthorized
resources to help me create this project under Sac State's guidelines. - TRI VO
Program Description: A program that prints my name, it uses method calls in the main method and for loops as well as
classes to reduce code redundancy.
*/

public class PrintTheVo {
// I created these classes to prevent redundancy in typing large strings over and over again
    public static void lineForB() {
        System.out.println("BBBBBBBBBBBB   ");
    }
    public static void lineOfB() {
        System.out.println("BBBBBBBBBBBBBBB");
    }
    public static void spacedB() {
        System.out.println("BBB         BBB");
    }
    public static void middleB() {
        System.out.println("      BBB      ");
    }


    // Here I made the classes to print out the letters themselves, vertically of course
    public static void printB() {
        lineForB();
        // I use for loops to not have to continually type out the same method
        for (int i = 0; i < 3; i++) {
            spacedB();
        }
        lineForB();
        for (int i = 0; i < 3; i++) {
            spacedB();
        }
        lineForB();
    }
    public static void printR() {
        lineForB();
        for (int i = 0; i < 3; i++) {
            spacedB();
        }
        lineForB();
        System.out.println("BBB     BBB    ");
        System.out.println("BBB      BBB   ");
        System.out.println("BBB       BBB  ");
        spacedB();
    }
    public static void printI() {
        lineOfB();
        for (int i = 0; i < 7; i++) {
            middleB();
        }
        lineOfB();
    }

    public static void printA() {
        middleB();
        System.out.println("   BBB   BBB   ");
        System.out.println("  BBB     BBB  ");
        System.out.println(" BBB       BBB ");
        spacedB();
        lineOfB();
        for (int i = 0; i < 3; i++) {
            spacedB();
        }
    }

    public static void printN() {
        System.out.println("BBBVV       BBB");
        System.out.println("BBB VV      BBB");
        System.out.println("BBB  VV     BBB");
        System.out.println("BBB   VV    BBB");
        System.out.println("BBB    VV   BBB");
        System.out.println("BBB     VV  BBB");
        System.out.println("BBB      VV BBB");
        System.out.println("BBB       VVBBB");
        spacedB();

    }
    // Main method
    public static void main(String[] args) {
        printB();
        System.out.println();
        printR();
        System.out.println();
        printI();
        System.out.println();
        printA();
        System.out.println();
        printN();
    }
}

