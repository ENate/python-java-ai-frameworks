// Defines a function before call and implementation
#include <iostream>
 //Name our parameters (using the same names as the actual function), because it allows you to understand what the 
 // function parameters are just by looking at the prototype.
int declaredFunction(int firstValue, int secondValue); // forward declaration of add() (using a function prototype)

// Define and call to main:
int main()
{
    // Call works because of addition of prototype above:
    int xValue{ 21 };
    int yValue{ 20 };
    std::cout << "The sum of both numbers if: " << declaredFunction(xValue, yValue) << '\n';
    return 0;
}
int declaredFunction(int firstValue, int secondValue)
{
    return firstValue + secondValue;
}