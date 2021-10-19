#include "sqHeaderGuard.h"

int getSquareSides()
{
    return 4;
}

int getSquareParameter(int sideLength)
{
    return sideLength * getSquareSides();
}
