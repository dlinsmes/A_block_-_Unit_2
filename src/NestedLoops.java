public class NestedLoops {
    public static void main(String [] args) {

        //loops can be nested - you can put one loop
        //in another loop
        for (int i = 0; i < 5; i++) {

            //the inner loop should use a different
            //variable
            for (int j = 0; j < 10; j++) {
                System.out.println("hi - i is " + i +
                        ", j is " + j);
                //prints hi 50 times (5*10)
            }

            //every time the outer loop runs, the inner
            //loop needs to restart and run to completion
        }
        System.out.println();

        //nested loops can be used to display 2d grids

        //outer loop controls how many rows there are
        for (int i = 0; i < 4; i++) {

            System.out.print("Row " + i + ": ");

            //inner loop controls the elements of each row
            for (int j = 0; j < 8; j++) {
                //use print() to keep everything from
                // the inner loop on the same line
                System.out.print("x");
            }
            //use println() after the inner loop to go
            //to the next line for the next row
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            //inner loop iterates based on the i value
            //-the quantity of numbers printed per row
            //depends on which row the program is on
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //same but with decreasing i values
        for (int i = 10; i > 0; i--) {
            //inner loop iterates based on the i value
            //-the quantity of numbers printed per row
            //depends on which row the program is on
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }




    }
}
