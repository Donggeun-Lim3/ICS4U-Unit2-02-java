/*
* This program gets some integer input,
* calculates the intger using recursion and shows the factorial integer.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-12-01
*/

import java.util.Scanner;

/**
* This is the calculator factorial program.
*/
final class CalculateFactorial {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private CalculateFactorial() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method uses recursion to be factorial some integeir.
    *
    * @param someInteger - positive integer
    *
    * @return factorialInteger
    */
    public static int factorial(final int someInteger) {
        final int returnValue;
        if (someInteger == 1 || someInteger == 0) {
            returnValue = 1;
        }
        else {
            returnValue = someInteger * factorial(someInteger - 1);
        }
        return returnValue;
    }

    /**
    * This method This program gets some integer input
    * and shows the factorial integer.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);

        // Input
        System.out.print("Enter the number to be factorial(!) "
                         + "(only positive integer): ");

        try {
            final int someInteger = Integer.parseInt(myObj.nextLine());
            if (someInteger >= 0 && someInteger != 1) {
                // Output
                System.out.println(someInteger + "! is just"
                                   + someInteger + "*"
                                   + (someInteger - 1) + "!");
                System.out.println(someInteger + "! = "
                                   + factorial(someInteger));
            }
            else if (someInteger == 1) {
                System.out.println(someInteger + "! is just "
                                   + factorial(someInteger));
            }
            else {
                System.out.println("Only positive!");
            }
        }
        catch (IOException exception) {
            System.err.println("Invalid input.");
        }

        System.out.println("\nDone.");
    }
}
