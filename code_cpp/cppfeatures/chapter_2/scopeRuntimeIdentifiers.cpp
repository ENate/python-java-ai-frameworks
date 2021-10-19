#include <iostream>

// Demonstrating identifier runtimes and scope
int addValues(int xVal, int yVal) // xVal and yVal are created and enter scope here
{
    return xVal + yVal; // xVal and yVal are visible/usable within this function only
} // Both identifiers go out of scope and are destroyed here


int main()
{
    // Create variables
    // Local variables inside the function body should 
    // be defined as close to their first use as reasonable:


    int theFirstValue{ 45 }; // theFirstValue a is created, initialized, and enters scope here
    int theSecondValue{ 32 }; // theSecondValue is created, initialized, and enters scope here
    // Call the addition function
    // Both are usable within this function only
    std::cout << "Added values from addition function: \n";
    std::cout << addValues(theFirstValue, theSecondValue);

    return 0;
} // Both go out of scope and are destroyed here
// Note that if function add were to be called twice, parameters x and y 
// would be created and destroyed twice -- once for each call.