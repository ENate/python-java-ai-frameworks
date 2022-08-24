#include "sortingalgs/MergeSortAlg.h"

namespace mergesortalg {

int MergeSortAlg::getMyArrSize() const {
    return myArrSize;
}

std::array<int, 10> MergeSortAlg::getArrayToSort() const
{
    return arrayToSort;
}

void MergeSortAlg::mulArray(int* piStart, int* piLast, int multiplier){

     // Calculate the size of the array (how many values it holds)
     unsigned int uiArraySize = piLast - piStart;

     // print each value held in the array
     for (unsigned int uiCount = 0; uiCount < uiArraySize; uiCount++)
          std::cout << *(piStart + uiCount) * multiplier << '\n';
}
}