#include "sqHeaderGuard.h"
#include <iostream>


int main()
{
    int valueNum{};
    std::cout << "Enter value to user: \n";
    std::cin >> valueNum;
    std::cout << "The number you entered is:  " << valueNum << '\n';
    std::cout << "The square has " << getSquareSides() << " sides \n";
    std::cout << "The square has perimeter: " << getSquarePerimeter(5) << '\n';
    return 0;
}
