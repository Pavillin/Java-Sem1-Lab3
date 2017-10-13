/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek6;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class LabWeek6 {
    public static void main(String[] args) {
        /**
         * 1.  Using a while loop, display the numbers 1-100 on the screen - 1 # on each line
         */
        int num1 = 1;
        System.out.println("1-100 WHILE LOOP START");
        while(num1 <= 100)
        {
            System.out.println(num1);
            num1++;
        }
        System.out.println("1-100 WHILE LOOP END");
        
        /**
         * 2.  Using a while loop, display the numbers 2-100 on the screen
         *     going up in units of 2.  For example 2, 4, 6, 8 ... 96, 98, 100
         */
        int num2 = 2;
        System.out.printf("%n2-100 BY 2 WHILE LOOP START");
        while(num2 <= 100)
        {
            System.out.println(num2);
            num2 += 2;
        }
        System.out.printf("%n2-100 BY 2 WHILE LOOP END%n");

        
        /**
         * 3.  Using a while loop, display the numbers 100-1 on the screen
         *     going down in units of 5.  For example 100, 95, 90, 85...10, 5
         */
        int num3 = 100;
        System.out.printf("%n100-1 BY 5 WHILE LOOP START");
        while(num3 >= 1)
        {
            System.out.println(num3);
            num3 -= 5;
        }
        System.out.printf("100-1 BY 5 WHILE LOOP END%n");

        

        /**
         * 4.  Using a while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 10
         */
        Scanner kb = new Scanner(System.in);
        int userGuess;
        System.out.printf("%nASK USER TO GUESS NUMBER UNTIL THEY ENTER 10 WHILE START");
        System.out.printf("%nGuess a number: ");
        userGuess = kb.nextInt();
        while(userGuess != 10)
        {
            System.out.print("That's not the number I'm thingking of. Try again: ");
            userGuess = kb.nextInt();
        }
        System.out.printf("That's the number I was thinking of! Good guessing!%n");
        System.out.printf("ASK USER TO GUESS NUMBER UNTIL THEY ENTER 10 WHILE END%n");
        
        
        /**
         * 5.  Using a do...while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 15
         */
        int userGuess2;
        System.out.printf("%nASK USER TO GUESS NUMBER UNTIL THEY ENTER 15 DO-WHILE START");
        
        do
        {
            System.out.printf("%nGuess a number: ");
            userGuess2 = kb.nextInt();
        } while(userGuess2 != 15);
        
        System.out.printf("That's the number I was thinking of! Good guessing!%n");
        System.out.printf("ASK USER TO GUESS NUMBER UNTIL THEY ENTER 15 DO-WHILE END%n");
        
        
        /**
         * 6.  Using a for loop, display the numbers 1-100 on the screen
         */
        int num6;
        System.out.println("1-100 FOR LOOP START");
        for (num6 = 1; num6 <= 100; num6++)
        {
            System.out.println(num6);
        }
        System.out.println("1-100 FOR LOOP END");
        

        /**
         * 7.  Using a for loop, display the numbers 2-100 on the screen, going up in steps of 2
         */
        int num7;
        System.out.println("2-100 BY 2 FOR LOOP START");
        for (num7 = 2; num7 <= 100; num7 += 2)
        {
            System.out.println(num7);
        }
        System.out.println("2-100 BY 2 FOR LOOP END");
        
        
        
        /**
         * 8.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 1
         */
        int num8;
        System.out.println("100-0 FOR LOOP START");
        for (num8 = 100; num8 >=0; num8--)
        {
            System.out.println(num8);
        }
        System.out.println("100-0 FOR LOOP END");

        
        /**
         * 9.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 5
         */
        int num9;
        System.out.println("0-100 BY 5 FOR LOOP START");
        for (num9 = 0; num9 <=100; num9 += 5)
        {
            System.out.println(num9);
        }
        System.out.println("0-100 BY 5 FOR LOOP END");

        
        
        /**
         * 10. Using the loop style of your choice, write a program that will display the numbers 1-100, where each
         *     number is on it's own line.  
         *      
         *     ->If the number displayed is divisible by 4, write your first name after the number.
         *     ->If the number displayed is divisible by 9, write your last name
         *     ->If the number displayed is divisble by both 4 & 9, write your first name a space and then your last name.
         */
        int num10;
        for (num10 = 1; num10 <=100; num10++)
        {
            System.out.printf("%n%3d. ", num10);
            if (num10 % 4 == 0)
            {
                System.out.print("Dylan ");
            }
            if (num10 % 9 == 0)
            {
                System.out.print("Sprague");
            }
        }
    }
    
}
