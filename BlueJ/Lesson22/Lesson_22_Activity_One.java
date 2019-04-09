/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_One {
    public static void main()
     {
     System.out.println("Enter a string");
     Scanner scan = new Scanner(System.in);
     String word = scan.nextLine();
     for (int i = 0; i < word.length(); i++) {
         System.out.println(word.charAt(i));
        }
}
}