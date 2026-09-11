/*
Name: Tri Vo (I prefer to go by Brian over Tri)
Date: September 10, 2026
Academic Integrity: I swear I wrote all this code by myself and that I did not plagiarize and or use unauthorized
resources to help me create this project under Sac State's guidelines.
Program Description: This demonstrates the ASCII art of my name using the fundamentals I have learned in Java.
Self-Assigned Grade: A- (Because the text is not as aligned as I'd expect it to be, and I'm too impatient to
change that.)
Logic Review: This program uses mainly tabs to create spacing and control alignment, using println to create new
consecutive lines where it prints a windowed ASCII-art like text of my initials of BV. Two backslashes are used,
because in Java backslashes are a special character that need two of them to display one. The repeated underscores and
vertical bars create the border around my program's artwork.
*/
class ArtOfMyName {
   public static void main(String[] args) {
      // Following the image guide, I used underscores and vertical bars to create the illusion of a 'window'
      System.out.println(" _______________________________________________________");
      System.out.println("|_______________________________________________________|");
      // The spacing of 7 tabs would be enough for these bars to separate from each other
      System.out.println("|\t\t\t\t\t\t\t|");
      System.out.println("|\t\t\t\t\t\t\t|");
      System.out.println("|\t\t\t\t\t\t\t|");
      // Here I made the initials BV using a combination of the letter B and backslashes, using escape sequences
      // appropiately as I needed to
      System.out.println("|\t     BBBBBBBBB\t\t\\\\\t       //\t|");
      System.out.println("|\t     B        B\t\t \\\\\t      //\t|");
      System.out.println("|\t     B        B\t\t  \\\\         //\t\t|");
      System.out.println("|\t     BBBBBBBBB \t\t   \\\\       //\t\t|");
      System.out.println("|\t     B        B\t\t    \\\\     //\t\t|");
      System.out.println("|\t     B        B\t\t     \\\\   //\t\t|");
      System.out.println("|\t     BBBBBBBBB \t\t      \\\\V//\t\t|");
      System.out.println("|\t\t\t\t\t\t\t|");
      System.out.println("|\t\t\t\t\t\t\t|");
      System.out.println("|\t\t\t\t\t\t\t|");
      System.out.println("|_______________________________________________________|");
      System.out.println("|_______________________________________________________|");



   }

}
