#ifndef SQUARE_H
#define SQUARE_H
#include <iostream>

int getSquareSides()
{
    int number{};
    std::cout << "Enter number: \n";
    std::cin >> number;
    return number * number;
}
#endif