package com.minejava.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import com.minejava.tutorials.dao.CoreLambda;

import sorting.BubbleSortAlg;
import sorting.MergeSortAlg;
import sorting.QuickSortAlg;

public class CoreJavaApplication {
    public static void main(String[] args) {
        List<CoreLambdaImpl> mPersons = new ArrayList<>();

    //
    CoreLambdaImpl coreLambdaImpl = new CoreLambdaImpl(23, "Hoster Maerst");
    CoreLambdaImpl coreLambdaImpl2 = new CoreLambdaImpl(25, "Jearter");
    CoreLambdaImpl coreLambdaImpl3 = new CoreLambdaImpl(23, "Hoster");

    mPersons.add(coreLambdaImpl);
    mPersons.add(coreLambdaImpl2);
    mPersons.add(coreLambdaImpl3);
    CoreLambda coreLambda = p -> p.getAge() >= 24;
    System.out.println(coreLambda.testPerson(coreLambdaImpl2));
    // Add entries
    // Call to function
    System.out.println();
    System.out.println("The name found is ..");
    CoreLambdaImpl cLambdaImpl = new CoreLambdaImpl();
    cLambdaImpl.verifyPersonsWithAge(mPersons);

    // Sotring
    // Merge sort

    int[] myArray = new int[]{12, 43, 100, 1, 2, 55, 67, 31, 3, 1, 10, 22, 6, 4, 5 , 6, 8};
        System.out.println();
        System.out.println("==========================Merge sorting.....==================");
        System.out.println("The initial unsorted array: ");
        System.out.println(Arrays.toString(myArray));
        System.out.println();
        System.out.println("The mid is: " + myArray.length / 2);
        int arrSize = myArray.length;
        int[] arrResult = MergeSortAlg.mergeSort(myArray, arrSize );
        System.out.println();
        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(arrResult));

        int[] myArrayToSort = new int[]{121, 43, 1001, 11, 12, 155, 67, 31, 3, 1, 10, 22, 6, 4, 5 , 6, 8};
        System.out.println();
        System.out.println("==========================Bubble sorting.....==================");
        System.out.println("The initial unsorted array: ");
        System.out.println(Arrays.toString(myArrayToSort));
        System.out.println();
        System.out.println("The mid is: " + myArray.length / 2);
        int arrSize2 = myArray.length;
        int[] sorteds2 = BubbleSortAlg.bSort(myArrayToSort, arrSize2);
        System.out.println();
        System.out.println("The sorted array using Bubble Sort is: ");
        System.out.println(Arrays.toString(sorteds2));

        int[] myArrayToSortX = new int[]{121, 43, 1001, 11, 12, 155, 67, 31, 3, 1, 10, 22, 6, 4, 5 , 6, 8};
        System.out.println();
        System.out.println("==========================Bubble sorting.....==================");
        System.out.println("The initial unsorted array: ");
        System.out.println(Arrays.toString(myArrayToSort));
        System.out.println();
        System.out.println("The mid is: " + myArrayToSortX.length / 2);
        int arrSize3 = myArrayToSortX.length;
        int[] sorteds3 = QuickSortAlg.qSortM(myArrayToSort, 0, arrSize3);
        System.out.println();
        System.out.println("The sorted array using Bubble Sort is: ");
        System.out.println(Arrays.toString(sorteds3));

    }

}
