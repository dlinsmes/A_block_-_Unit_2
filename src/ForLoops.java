import java.util.Scanner;

public class ForLoops {

    public static void main(String [] args) {
        //warm up - prompt the user for their favorite color out of
        //red, green, blue, or purple (or any set of 4 options)
        //and validate their input

        Scanner s = new Scanner(System.in);
        System.out.println("What's your favorite color: red, green," +
                "blue, or purple?");
        String c = s.nextLine();

        //while(!(c.equals("red") || c.equals("green") || c.equals("blue")
        //        || c.equals("purple"))) {

        while ( !c.equals("red") && !c.equals("green") && !c.equals("blue")
                && !c.equals("purple") ) {

            System.out.println("that's not a real color");
            System.out.println("What's your favorite color: red, green," +
                    "blue, or purple?");
            c = s.nextLine();
        }

        System.out.println("good job");

        //for loops
        //use for loops when you can determine the number
        //of iterations before the loop begins

        //parts of a for loop:
        //initialization: int i = 0
        //condition: i < 10
        //increment: i++

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //when a for loop runs, the variable takes the initial value,
        //checks whether the condition is true,
        // if so - runs the loop code, changes the variable according to
        //the increment step, then checks whether the condition
        //is true before iterating again

        //9 is the last number printed in the loop because when
        //i becomes 10, the condition is no longer true

        System.out.println();


        //the variable declared for the loop only exists within the loop
        //System.out.println(i);

        for (int i = 4; i > 0; i--) {
            System.out.print(i + " ");
            //prints 4, 3, 2, 1
        }
        System.out.println();

        //same thing but as a while loop:
        int j = 4;
        while (j > 0){
            System.out.print(j + " ");
            j--;
        }
        System.out.println();

        //ask the user for 3 numbers in a loop,
        //then print the sum of numbers

        int sum = 0;
        //declare sum before the loop so that you can keep adding to
        //the old value of sum
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number");
            int num = s.nextInt();
            sum += num;
        }
        System.out.println("sum is " + sum);

        //ask the user for what number they want multiples of
        //and also how many multiples to print
        System.out.println("what number do you want multiples of?");
        int mult = s.nextInt();
        System.out.println("how many multiples do you want printed?");
        int numMult = s.nextInt();

        for (int i = 1; i <= numMult; i++) {
            System.out.println(mult + " x " + i + " = " + (mult*i));
        }

        for (int k = mult; k < mult*numMult + 1; k= k + mult) {
            System.out.println(k);
        }

        //ask the user for a prime number
        //and use a loop to check whether it's really prime or not
        System.out.println("Enter a prime number");
        int num = s.nextInt();

        //a number is prime only if it's divisible by itself and 1

        boolean isPrime = true;
        for(int i = 2; i < num; i++) {
            //check if num is divisible by any number in the range
            // [2, num)
            if (num % i == 0) {
                isPrime = false;
            }
        }

        //same as isPrime == true
        if (isPrime) {
            System.out.println("that's a prime number");
        }
        //same as isPrime == false
        if (!isPrime) {
            System.out.println("that's not a prime number");
        }





    }
}
