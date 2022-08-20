#include <iostream>

#define ENABLE_DEBUG

int getInputFromUser()
{
#ifdef
    std::cerr << "getInputFromUser() \n";
#endif
    // Enter integer from user
    std::cout << "Enter number: \n";
    int numberEntered{};
    std::cin >>numberEntered;
    return numberEntered;
}

int main()
{
#ifdef ENABLE_DEBUG
    std::cerr << "main() call \n";
#endif
    // Call the function
    int numFromUser{getInputFromUser()};
    std::cout << "The number entered is : " << numFromUser << '\n';
    return 0;
}
