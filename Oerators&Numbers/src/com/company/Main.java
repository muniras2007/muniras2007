package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//	1.Write the following integers in binary notation.
//  Do not use any Java functions or online conversion applications to calculate the answer
//  as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
//        1 in binary is 1

//        8 in binary is 1000

//        33 in binary is 100001

//        78 in binary is 1001110

//        787 in binary is 1100010011

//        33,987 in binary is 1000010011000011

//        2.Convert the following binary numbers to decimal notation.
//        Do not use any Java functions or online conversion applications to calculate the answer
//        as this will hinder the learning process and your understanding of the concept.
//                However, you may check your answers using Java methods.
//        0010 = 2
//        1001 = 9
//        0011 0100 = 52
//        0111 0010 = 114
//        0010 0001 1111 = 543
//        0010 1100 0110 0111 = 11367

//        3. Write a program that declares an integer a variable x and assigns the value 2 to it
//        and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
//                Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
//        Before printing the results, write a comment with the predicted decimal value and binary string.
//        Now, print out x in decimal form and in binary notation.
//
                  //       int x = 2;
//                        System.out.println( Integer.toBinaryString(x));
//                        int y = x <<1;
//                    System.out.println(Integer.toBinaryString(y));
//                    System.out.println(y);

  //      Do the preceding exercise with the following values:
//        9,17,88

//        4.Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number.
//        Now use the right shift operator (>>) to shift by 2 and assign the result to x.
//        Write a comment indicating what you anticipate the decimal and binary values to be.
//        Now print the value of x and the binary string.

            //    int x = 150;
            //   System.out.println(Integer.toBinaryString(x));

              //  int y = x >> 2;
              //  System.out.println(y);
               // System.out.println(Integer.toBinaryString(y));

//        Do the preceding exercise with the following values:

        //225,1555,32456

//        5.Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y.
//        Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
//        Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
//
//                As before, write a comment that indicates what you predict the values to be before printing them out.

//                       int x = 7; //111
//                       int y = 17;//10001
//                       //the answer will be 1
//                       int z = x & y;
//                     System.out.println(z);
//                     System.out.println(Integer.toBinaryString(z));
//
//        //Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y.
//                    int k = x | y;
//                    // the answer will be 10111
//                    System.out.println(k);
//                    System.out.println(Integer.toBinaryString(k));


//        6.Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
//                Print the value before and after the increment operator.
//                  int x = 5; // x++ is called post increment and ++x is called pre increment.
//                  System.out.println(x);
//                  int y = x++;
//                  System.out.println(y);

        //7.Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
       // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.
       // int x = 7;
        //System.out.println(x);
        //int y = ++x;
        //System.out.println(y);
       // int z = ++y;
       // System.out.println(z);

//        8.Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
//        Create another variable sum and assign the value of ++x added to y and print the result. Notice the value of the sum (should be 14).
//        Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of sum is.
//                The first configuration incremented x and then calculated the sum
//    while the second configuration calculated the sum and then incremented x.

                int x =5;
                int y = 8;
                int n = ++x;
                int z = n+y;
                int v =x++;
                int f = v+y;
        System.out.println(z);
        System.out.println(f);


    }
}
