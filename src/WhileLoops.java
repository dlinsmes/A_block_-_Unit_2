import java.util.Scanner;

public class WhileLoops {

    public static void main(String [] args) {

        //variable scope refers to a variable's
        // visibility
        int a = 7;
        int b = 0;
        //since a and b were declared in main(), the can
        //be used anywhere in main(), including if-statements
        //and loops

        if (a > 5) {
            //update the value of b
            b = 20;

            int c = 20;
            System.out.println("c is " + c);
            //since c was declared in the if-statement,
            //it can be used here, but the program
            //doesn't know c exists OUTSIDE of the
            //if-statement
        }

        System.out.println("a is " + a);
        System.out.println("b is " + b);

        //the scope of c doesn't reach outside the
        //if-statement
//        System.out.println("c is " + c);

        int outcome = 1;
        if (a == b) {
             outcome = 3;
        }
        System.out.println(outcome);
        System.out.println();

        //loops let us repeat code some number of times
        //while loops will continue to run as long as
        //the condition remains true
        //(like a repeating if statement)
        int x = 0;
        while (x < 5) {
            //a while loop condition is also called
            //the termination condition
            System.out.println(x);

            //important - make sure you have a step
            //in your loop that will eventually make
            //the condition for the loop false
            x++;
            //if the  termination condition is never
            //met, the loop will be an infinite loop,
            //which is bad

            //if your program ever seems stuck when it's
            //running, it might be in an infinite loop
        }

        //any lines after the loop won't run until
        //the loop is complete
        System.out.println("loop has ended");

        //while loops are useful when you don't know
        //how many times it needs to iterate (run)
        //(the condition isn't number-based)

        Scanner s = new Scanner(System.in);
        System.out.println("Enter quit to stop");
        String input = s.nextLine();
        int count = 1;

        while (!input.equals("quit")) {
            System.out.println("Enter quit to stop");

            //this line makes sure the condition can become false
            input = s.nextLine();

            count++;
        }
        System.out.println("you were asked " + count +
                " times before you typed quit");


        System.out.println("Please enter a number: 1, 2, or 3");
        int num = s.nextInt();

        //continuously ask them for a new number if their input
        //is invalid

        //for validation loops, run the loop when the
        //input is invalid
        while(!(num == 1 || num == 2 || num == 3)) {
            //DeMorgan's law - when a boolean expression
            //is negated, you can distribute the !
            //and flip any ands/ors
            // !(A or B) is the same as (!A and !B)
            // !(A and B) is the same as (!A or !B)
            // the while condition:
            // !(num == 1 || num == 2 || num == 3)
            // is the same as
            //  (num != 1 && num != 2 && num != 3)

            System.out.println("invalid input");
            System.out.println("Please enter a number: 1, 2, or 3");
            num = s.nextInt();
        }

        System.out.println("good job");

    }

}
