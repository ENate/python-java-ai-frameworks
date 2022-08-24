package sorting;

public class BubbleSortAlg {

    // Define method

    public static int[] bSort(int[] arrayToSort, int arrLength) {

        /**
         *@param arrayToSort to sort
         */

         // Outer loop
         for (int outIdx = 0; outIdx < arrLength - 1; ++outIdx) {
            // second loop to swap close by items
            for (int kIdx = 0; kIdx < arrLength - outIdx - 1; ++ kIdx) {
                // check if two items
                if (arrayToSort[kIdx + 1] < arrayToSort[kIdx]) {
                    // swap
                    int swapElement = arrayToSort[kIdx];
                    arrayToSort[kIdx] = arrayToSort[kIdx + 1];
                    arrayToSort[kIdx + 1] = swapElement;

                }
            }

         }
         return arrayToSort;
    }
}
