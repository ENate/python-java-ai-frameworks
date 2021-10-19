#include <iostream>

int main()
{
    //needed so main.cpp knows that add() is a function declared elsewhere
    int fromAddFile(int valueOne, int valueTwo);
    // Initialize arguments
    int firstNum{ 34 };
    int secondNum{ 11 };
    // when we say cout, we mean the cout defined in the std namespace
    std::cout << "The sum from addFile equals: " << fromAddFile(firstNum, secondNum) << '\n';
    return 0;
}