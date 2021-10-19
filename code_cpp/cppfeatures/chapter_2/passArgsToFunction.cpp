#include <iostream>


// Define function with args pass to params

void printArgs(int x, int y)
{
    std::cout << "The value of x is: " << x << '\n';
    std::cout << "The value of y is: " << y << '\n';
}
// Get values from user
int getValueFromUser()
{
    std::cout << "Enter an integer: \n";
    int inputInteger{};
    std::cin >> inputInteger;
    return inputInteger;
}

// Function to double integer
void doubleIntegerFromUser(int integerFromUser)
{
    std::cout << "Doubling the User Integer equals: " << integerFromUser * 2 << '\n';
}

int main() {
    // call function
    std::cout << "Values entered in main() function are: \n";
    printArgs(3, 4);
    std::cout << "Values entered by user and pass via getUserFunction(): \n";
    // Call the UserIntegerFunction
    int intValueFromUser{ getValueFromUser() };
    doubleIntegerFromUser(intValueFromUser);
    std::cout << "Simplifying the calls, by chaining function calls: \n";
    doubleIntegerFromUser(getValueFromUser());
    return 0;
}
