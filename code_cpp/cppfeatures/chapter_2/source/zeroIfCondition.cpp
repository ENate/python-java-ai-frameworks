#include <iostream>

int main()
{
    // Normally defined cout statement for output:
    std::cout << "The usual cout statement print out \n";
    // Define the if-0 block:
#if 0
    std::cout << "Printing the IF-0 \n";
    std::cout << "The names are Diogenes and Manes\n";
#endif
    return 0;
}
