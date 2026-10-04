/*
Name: Brian Vo
Date: September 29, 2026
Program Reflection: Overall, as a first coding assignment I truthfully haven't learned anything new regarding to Java, but something clicked in the process of
programming this and that was how I'd breakdown the figures into multiple methods that would meet the criteria of the assignment. I think that was the largest hurdle
I had to overcome, and once I did it was like a breath of fresh air. It was like I using a computational brain to figure out "Okay, what should this all look like?"
*/
public class CastlesHelper {

    // Method 1: This is two println statements that use an escape sequence to construct what is supposed to be the roof
    public static void roof() {
        System.out.println("           +---+                        +---+              ");
        System.out.println("          /     \\                      /     \\           ");

    }

    // Method 2: This is two println statements that use an escape sequence to construct what is supposed to be the tower, and uses a longer "base" figure
    public static void tower() {
        System.out.println("         /       \\                    /       \\           ");
        System.out.println("        +---------+                  +---------+            ");
    }

    // Method 3: These are two println statements that form the lower base of the castle, and followed by a space to create organization between the figures
    public static void base() {
        System.out.println("        |  | | |  |                  |  | | |  |            ");
        System.out.println("        +---------+                  +---------+            ");
        System.out.println("");
    }

    // Method 4: This is a variation of previous two println statements, being a 3 printlns that create a longer lower base of the large castle figures
    public static void base2() {
        System.out.println("        |  | | |  |                  |  | | |  |            ");
        System.out.println("        |  | | |  |                  |  | | |  |            ");
        System.out.println("        +---------+                  +---------+            ");
    }

    // Method 5: For the smaller base part of the large castles, these two println statements print out the same two statements to reduce redundancy
    public static void base3() {
        System.out.println("           +---+                        +---+               ");
        System.out.println("           +---+                        +---+               ");
    }

    // Method 6: This method prints out the small castles using the 3 previous established
    public static void drawSmallCastles() {
        roof();
        tower();
        base();
    }

    // Method 7: This method prints out the larger castles using 4 of the previously established methods before
    public static void drawLargeCastles() {
        roof();
        tower();
        base2();
        base3();
    }

    // Method 8: Finally, if called... drawFigures will print out the castle figures
    public static void drawFigures() {
        drawSmallCastles();
        drawLargeCastles();
    }
}
