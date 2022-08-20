#include <iostream>

int main()
{
    // Intialize the number
    int numberEntered{};
    int secondNumEntered{};
    // using the cin to accept input via the input operator >>
    std::cout << "Enter the number \n";
    std::cin >> numberEntered;
    // Multiply the number by 2 and print result of expression
    // Enter second number
    std::cout << "Enter another number \n";
    std::cin >> secondNumEntered;
    std::cout << "Multiplying by 2 we get: " << numberEntered * 2 + secondNumEntered << '\n';
    std::cout << "The end of the program" << '\n';
    return 0;
}
