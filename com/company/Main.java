package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        anotherArray[1] = 3;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
        System.out.println(Arrays.toString(array));
    }

    private static void modifyArray(int[] array) {

        array[2] = 5;
        array = new int[] {1,2,3,4,5}; // Using the new keyword creates a new array

    }
}

/* Output:
[0, 0, 0, 0, 0]
[0, 0, 0, 0, 0]
[1, 3, 0, 0, 0]
[1, 3, 0, 0, 0]
[1, 3, 5, 0, 0]
[1, 3, 5, 0, 0]
 */
