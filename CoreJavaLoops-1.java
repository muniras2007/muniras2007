package com.company;

public class CoreJavaLoops {
    public static void main(String[] args) {

//       Q1. Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
//        int x;
//        for(x=1; x<=10;x++){
//            System.out.println(x);
//
////         Q2. Write a program that uses a while loop to loop through the numbers 0-100
////        in increments of 10 and prints out each number.
//
        //       int num = 0;
        //       while(num <= 100) {
        //           System.out.println(num);
        //          num += 10;
        //     }

//       Q3.Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
//        int x =1;
//        do{
//            System.out.println(x);
//            x++;
//        } while(x<=10);
//
//        Q4. Write a program that uses a for-loop to loop through the numbers 1-100.
//        Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75.
//        Use the “continue” statement to accomplish this.

//        int x;
//        for (x = 1; x <= 100; x++) {
//            if (x % 5 == 0) {
//                if (x > 25 && x < 75) {
//                    continue;
//                } else {
//                    System.out.println(x);
//                }
//            }


//         Q5. Write a program that uses a for-loop to loop through the numbers 1-100.
//    Print out each number if is a multiple of 5, but do not print out any numbers greater than 50.
//    Use the “break” keyword to accomplish this.
//            int x;
//            for(x=1; x<=100; x++) {
//                if (x % 5 == 0) {
//                    if (x > 50) {
//                        break;
//                    }
//                    System.out.println(x);
//                }
//            }


//    Q6.  Write a program that uses nested for-loops to output the following:
//    Week 1:Day 1   Day 2   Day 3 Day 4 Day 5
//
//
//    Week 2: Day 1   Day 2   Day 3 Day 4 Day 5

//            int weeks =2;
//            int days= 5;
//             //outer loop prints weeks
//        for (int x=1; x<= weeks; x++){
//            System.out.println("Week:"+ x);
//            //inner loop prints days
//            for (int y =1; y<=days; ++y) {
//                System.out.println(" Day: " + y);
//            }
//
//            }
//        }


//    Q7. Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
//            11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
        //palindrome means number remains the same when digits are reversed

//        int min = 10;
//        int max = 200;
//
//        printPal(min, max);
//    }
//
//    /**
//     * Returns true if the given num is palindrome
//     *
//     * @param num
//     * @return
//     */
//    private static boolean isPalindrome(int num) {
//        // Reversing a number
//        int reverse = 0;
//        for (int i = num; i > 0; i /= 10)
//            reverse = reverse * 10 + i % 10;
//
//        // If num and reverse are same, then num is palindrome
//        return num == reverse;
//    }
//
//    /**
//     * Prints palindrome between min and max
//     *
//     * @param min
//     * @param max
//     */
//    static void printPal(int min, int max) {
//        for (int i = min; i <= max; i++)
//            if (isPalindrome(i))
//                System.out.print(i + " ");
//    }
//}
//
//
//    Q8.Write a program that prints the Fibonacci Sequence from 0 to 50.
//    The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
        //The Fibonacci series is a series where the next term is the sum of the previous two terms.
        // The first two terms of the Fibonacci sequence are 0 followed by 1.
//        int n = 10, firstTerm = 0, secondTerm = 1;
//        System.out.println("Fibonacci series Till" + n + "Terms:");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(firstTerm + ",");
//
//            //compute next term
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }
//    }
//}

//    Q9.Write a program that nests a for-loop inside another.
//    Print out the inner and outer variable (e.g., i or j) in the inner loop
//    (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
        int rows = 5;

        // outer loop
        for (int i = 1; i <= rows; ++i) {

            // inner loop to print the numbers
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}








