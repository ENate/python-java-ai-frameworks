// The goals is to compute the sum of two numbers

int getNumFromUser();
char getMathOperator();
int computeSum(int value1, char o, int value2);
// The main function starts here
#include <iostream>

int main()
{
    // Get first number from user
    int valueFromUser{ getNumFromUser() };

    std::cout << "First Number : " << valueFromUser << '\n';
    // Get the mathematical operator
    char matOp{ getMathOperator() };
    // getMathOperator();
    // Get number from User
    int secValue{ getNumFromUser() };
    // perform calculation
    std::cout << "The result is: " << computeSum(valueFromUser, matOp, secValue) << '\n';
    // print the final result
    // printResult()
    return 0;
}
// Implementations
int getNumFromUser()
{
    int number{};
    std::cout << "Enter number: ";
    std::cin >> number;
    return number;
}
// for the operator
char getMathOperator()
{
    char mathOperator{};
    std::cout << "Enter the operator:  ";
    std::cin >> mathOperator;
    return mathOperator;
}
int computeResult(int value1, char o, int value2)
{
    return value1 + value2;
}