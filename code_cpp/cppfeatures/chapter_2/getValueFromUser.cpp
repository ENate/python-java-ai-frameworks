#include <iostream>

int getValueFromUser()
{
    std::cout << "Enter an integer: \n";
    int inputInt{};
    std::cin >> inputInt;
    return inputInt;
}
int main() {
    // getValueFromUser();
    int enteredNumber{ getValueFromUser() };
    std::cout << "The number is: " << enteredNumber << '\n' << " Doubled number: " << enteredNumber * 2 << '\n';
    return 0;
}