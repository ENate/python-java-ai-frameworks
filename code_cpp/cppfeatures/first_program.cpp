#include <iostream>

int main()
{
    // Intialize the number
    int numberEntered{};
    // using the cin to accept input via the input operator >>
    std::cout << "Enter the number \n";
    std::cin >> numberEntered;
    // Multiply the number by 2 and print result of expression
    std::cout << "Multiplying by 2 we get: " << numberEntered * 2 << '\n';
    return 0;
}