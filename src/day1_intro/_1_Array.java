package day1_intro;

import java.util.Arrays;

/**
 * An array is type of object that can hold an ordered collection of elements
 * Array indices start with zero
 */
public class _1_Array {
    public static void main(String[] args) {
        int aSingleNumber = 10;
        int[] arrayOfInts = new int[5];
        // first element arrayOfInts[0]
        // ..
        // first element arrayOfInts[4]

        /*
         * Default value tergantung dari tipe data yang diberikan
         * apabila non-primitive = null
         * primitive = 0/false
         */

        // cara mengetahui besar sebuah array
        System.out.println(arrayOfInts.length);

        // TODO IndexOutOfBoundException

        // Array 2 Dimensi
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(matrix[1][1]);
    }
}
