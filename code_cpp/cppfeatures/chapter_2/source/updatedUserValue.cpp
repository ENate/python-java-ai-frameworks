#include <iostream>

int getValueFromUserUpdated()
{
    std::cout << "Enter an integer: \n";
    int inputInt{};
    std::cin >> inputInt;
    return inputInt;
}
int main() {
    // getValueFromUser();
    int enteredNumberOne{ getValueFromUserUpdated() };
    int enteredNumberTwo{ getValueFromUserUpdated() };
    std::cout << "Sum of numbers is: " << enteredNumberOne + enteredNumberTwo << '\n';
    std::cout << " Multiplied numbers: " << enteredNumberOne * enteredNumberTwo << '\n';
    return 0;
}
