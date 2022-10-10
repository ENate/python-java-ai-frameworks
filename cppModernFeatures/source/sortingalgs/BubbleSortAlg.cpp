#include "sortingalgs/BubbleSortAlg.h"

namespace bubblesortalg {

void BubbleSortAlg::mulArray(int* arrayElts) {
    for (int firstIndex = 0; firstIndex < arrayElts.length; firstIndex++)
    {
        /** Enter another for to loop up to the current element */
        for (int secIdx = 0; secIdx < firstIndex; secIdx++)
        {
            /** define a temp variable and swap elements */
            if (arrayElts[secIdx] > arrayElts[secIdx + 1]) {
            // Save next element in the newly created swap variable
            int mySwap = arrayElts[secIdx + 1];
            arrayElts[secIdx + 1] = arrayElts[secIdx];
            arrayElts[secIdx] = mySwap;
            }

        }

    }

    }

}