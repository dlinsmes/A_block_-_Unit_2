import java.util.Scanner;

public class LoopPractice {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        //warm up - prompt the user to enter 5 numbers,
        //then output the biggest and smallest of the 5 numbers
        //write the code to work with any quantity of numbers, i.e. use a loop



        //set min to the highest possible value so that any number that's input
        //will replace the old value and become the new min
        int min = Integer.MAX_VALUE;

        // set to the smallest possible value
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.println("enter a number");
            int n = s.nextInt();

            // as each number is input, compare it to the current max and min,
            //amd update the max/min if needed
            //-don't need to save every value that's input
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }

        System.out.println("min is " + min + ", max is " + max);

        System.out.println("maximum integer is " + Integer.MAX_VALUE);
        System.out.println("minimum integer is " + Integer.MIN_VALUE);


        //if you try to represent numbers outside the range of [MIN_VALUE, MAX_VALUE],
        //the values won't behave as expected
        System.out.println(Integer.MAX_VALUE+1);

        System.out.println(Integer.MIN_VALUE - 1);

        System.out.println(Integer.MIN_VALUE - Integer.MAX_VALUE);


        //a string's length is the number of characters it has
        String word = "apple";
        System.out.println("length of " + word + " is " + word.length());

        //a substring is a part of a string that you indicate using indices
        //-an index is a position and indexing starts at 0

        //substring() with one number gives the part of the string starting
        //at the provided index until the end
        System.out.println("substring of " + word + " beginning at " +
                "index " + 2 + " is " + word.substring(2));

        //substring() with two numbers gives the part of the string starting
        //at the provided index until but not including the ending index
        System.out.println("substring of " + word + " beginning at " +
                "index " + 3 + " and ending at but not including index " +
                5 + " is " + word.substring(3, 5));

        //to isolate a single letter, the substring indices should be consecutive numbers
        System.out.println(word.substring(0, 1));


        //have the user input a string and determine whether it's a palindrome
        //-a palindrome is a word that's spelled the same both forward and backward

        word = "racecar";
        boolean isPal = true;

        //need to make half the number of comparisons as the string length
        //use int division, which will work whether the string length is even or odd
        for (int i = 0; i < word.length()/2; i++) {
            String letter1 = word.substring(i, i+1);

            //letter 2 is the letter in the mirror position starting from the end of the word
            String letter2 = word.substring(word.length()-i-1, word.length()-i-1+1);
//            System.out.print(letter2 + " ");
            if(!letter1.equals(letter2))
                isPal = false;
        }
        if (isPal)
            System.out.println("that's a palindrome");
        else
            System.out.println("not a palindrome");


    }
}
