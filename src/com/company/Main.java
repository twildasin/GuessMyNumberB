package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean guessed = false;
        int attempts = 0;
        int num = 50;
        int min = 1;
        int max = 101;
        String input = "";
        Scanner in;

        System.out.println("Guess My Number\n\nInstructions:\nThe program will give a number.\nRespond accordingly with 'higher' or 'lower'.\nIf that is your number enter 'correct'");

        System.out.println("\nFirst number: 50");

        while(guessed == false && attempts <= 5)
        {
            in = new Scanner(System.in);
            input = in.nextLine();

            if (Objects.equals(input, "correct") || Objects.equals(input, "Correct"))
            {
                guessed = true;
                attempts++;
            }

            else if (Objects.equals(input, "higher") || Objects.equals(input, "Higher"))
            {
                //System.out.println(input);
                min = num;
                num = (min + max) / 2;
                System.out.println("Next number: " + num);
                attempts++;
            }

            else if (Objects.equals(input, "lower") || Objects.equals(input, "Lower"))
            {
                max = num;
                num = (min + max) / 2;
                System.out.println("Next number: " + num);
                attempts++;
            }

            else
            {
                System.out.println("Invalid input, please insure you are using only the three possible input explained in the instructions");
            }

            if(attempts == 6 && guessed == false)
            {
                attempts++;
                guessed = true;
            }


        }

        System.out.println("\nYour number is " + num + "\nAttempts taken: " + attempts);

    }
}
