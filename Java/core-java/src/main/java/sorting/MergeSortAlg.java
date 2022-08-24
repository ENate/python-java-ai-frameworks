package sorting;

import java.util.Arrays;

public class MergeSortAlg {


    public static int[] mergeSort(int[] inputArray, int sizedArray) {
        /**
         * @param: inputArray: array object
         */

        if (sizedArray < 2 ) {
            return inputArray;
        }
        // Deter mine floor
        // int middle = sizedArray / 2;
        int middle = Math.floorDiv(sizedArray, 2);
        // define two arrays from main array
        //left_arr = inp_arr[:middle]
        int[] leftArray = Arrays.copyOfRange(inputArray, 0, middle);
        int[] rightArray = Arrays.copyOfRange(inputArray, middle, sizedArray);

        //int[] leftArray = new int[middle];
        //int[] rightArray = new int[sizedArray - middle];

        //for (int i = 0; i < middle; i++) {
        //    leftArray[i] = inputArray[i];
        //}
        //for (int i = middle; i < sizedArray; i++) {
       //     rightArray[i - middle] = inputArray[i];
        //}
        // right_arr = inp_arr[middle:]
        //calculate size of left_size = len(left_arr)
        int leftSize = leftArray.length;
        //right_size = len(right_arr)
        int rightSize = rightArray.length;

        // recursion
        mergeSort(leftArray, leftSize);
        mergeSort(rightArray, rightSize);

        merger(inputArray, leftArray, rightArray, middle, sizedArray - middle);

        // System.out.println(Arrays.toString(inputArray));
        return inputArray;

    }

    public static void merger(int[] inputArr, int[] leftArr, int[] rightArr, int leftSize, int rightSize) {

        int pIndex = 0;
        int qidIndx = 0;
        int rIndx = 0;
        // Start sorting proper
        while (pIndex < leftSize && qidIndx < rightSize) {

            if (leftArr[pIndex] <= rightArr[qidIndx]) {
                inputArr[rIndx++] = leftArr[pIndex++];
            } else {
                inputArr[rIndx++] = rightArr[qidIndx++];
            }
        }
        // Not done with p!
        while (pIndex < leftSize) {
            inputArr[rIndx++] = leftArr[pIndex++];
        }

        // For the right side
        while (qidIndx < rightSize) {
            inputArr[rIndx++] = rightArr[qidIndx++];
        }

    }
}
