#include <iostream>

// demonstrating the basic doPrint function definition
// doPrint is the called function

void doPrint()
{
    std::cout << "Demonstrating the doPrint() \n";
}

void firstCall()
{
    std::cout << "The first call from it! \n";
}

int secondCall()
{
    int numberEntered{};
    std::cout << "Enter number: \n";
    std::cin >> numberEntered;
    std::cout << "Call to firstCall() sfunction: \n";
    firstCall();
    std::cout << "Number entered is: " << numberEntered << '\n';
    return numberEntered;
}

int main()
{
    std::cout << "The  doPrint function call: \n";
    doPrint();
    std::cout << "Two doPrint() functin calls \n";
    doPrint();
    doPrint();
    std::cout << "Call to secondCall() function: \n";
    int enteredNum{ secondCall() };
    std::cout << "Multiplying number by 2 gives : " << enteredNum * 2 << '\n';
    return EXIT_SUCCESS;
    // same as return 0;
}
