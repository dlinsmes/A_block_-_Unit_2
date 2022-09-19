import java.util.Scanner;

public class Conditionals {

    public static void main(String [] args) {

        //simulate flipping a coin and print out
        //the result
        //-use math.random()
        //generate 1 or 2
        int random = (int)(Math.random() * 2) + 1;

        //a conditional (if) statement checks if a condition is true
        //and if so, the code inside the statement runs
        if (random == 1) {
            System.out.println("you got heads");
        }
        //the else clause runs when the condition for the if-clause
        //immediately above it is false
        else {
            System.out.println("you got tails");
        }

        //get input from the user for 3 numbers, then output
        //the biggest of the 3
        Scanner s = new Scanner(System.in);

        System.out.println("enter 3 integers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println("You entered " + a +
                ", " + b + ", and " +c);

        int max = 0;
        if (a > b && a > c) {
            max = a;
        }
        else if (b > a && b > c) {
            max = b;
        }
        //use "else if" for b because "else" only follows the
        //if that comes right above it. When the condition checking
        //b only uses an "if", it runs independently from the
        //conditional checking a
        else {
            max = c;
        }
        //when you have multiple ifs, else ifs, and elses, only the
        //first one that's true will run

        System.out.println("The biggest number is " + max);


        //since we're switching from numerical to string input,
        //use an extra nextLine() to avoid skipping input
        s.nextLine();

        //have the user enter a password and give feedback for whether
        //it's correct, 0 length, correct length, or incorrect

        String realPassword = "password";

        System.out.println("Enter the password");
        String userPass = s.nextLine();

        if (realPassword.equals(userPass)) {
            System.out.println("Yay you did it I'm so proud of you I guess");
        }
        //a String's length is the number of characters in it
        else if (userPass.length() == 0) {
            System.out.println("you didn't type anything, dummy");
        }
//        int x = 10;
        //don't add other code between ifs and else ifs
        else if (userPass.length() == realPassword.length() )
            System.out.println("Nice try but NO");

        else
            System.out.println("WRONG");
            System.out.println("this will always print because else doesn't " +
                    "have curly braces");
        //you don't NEED curly braces when the code to run for
        //an if/else if/else is only one line,
        //but if there are multiple lines for that branch, use
        //curly braces
        //-otherwise any lines after the first one are not considered
        //as part of the branched code

        //check if an input number is between 10 and 20
        System.out.println("Enter a number between 10 and 20");
        int num = s.nextInt();
        //if-statements can be nested
        //when the outer condition is false, the inner condition
        //won't get checked
        if (num > 10) {
            if (num < 20) {
                System.out.println("good job wow you did it you're so smart");
            }
            else
                System.out.println("number out of range - too high");
        }
        else
            System.out.println("number out of range - too low");


    }
}
