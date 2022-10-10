package sorting;

public class QuickSortAlg {

    public static int[] qSortM(int[] originalArray, int beginIdx, int endIdx) {

        // base case
        if (beginIdx < endIdx) {
            int partitionIndex = partition(originalArray, beginIdx, endIdx);

            // First recursive to partioned index
            qSortM(originalArray, beginIdx, partitionIndex - 1);
            qSortM(originalArray, partitionIndex + 1, endIdx);
        }


        return null;
    }

   public  static int partition(int[] arrMine, int beginIndex, int endIndex) {

        // find the pivot
        int pivotElement = arrMine[endIndex];
        int iIndex = beginIndex - 1;

        // begin sorting the array
        for (int idx = beginIndex; idx < endIndex; idx++) {

            if (arrMine[idx] <= pivotElement) {
                // increment iIndex
                iIndex++;
                // swap elements
                int swapElement = arrMine[iIndex];
                arrMine[iIndex] = arrMine[idx];
                // store our new element
                arrMine[idx] = swapElement;
            }

        }
        // Add last element
        int swapElement = arrMine[iIndex +1];
        arrMine[iIndex + 1] = arrMine[endIndex];
        arrMine[endIndex] = swapElement;
        return iIndex + 1;
    }
}
