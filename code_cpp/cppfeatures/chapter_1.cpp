#include <iostream>

// Don't worry about what & is for now, we're just using it to trick the compiler into thinking variable x is used
void doNothing(int&)
{
}
int main()
{
    int first_value{ }; // Entered first value and zero initalize it
    int second_value{}; // Entered second value and zero initialize it
    int x_do_nothing{};

    // Enter first and second values
    std::cout << "Enter first value \n";
    std::cin >> first_value;
    std::cout << "Enter second value: \n";
    std::cin >> second_value;

    // Print entered values
    std::cout << "The first entered value is : " << first_value << '\n';
    std::cout << "The second entered value is: " << second_value << '\n';
    std::cout << "This is the doNothing() function: \n";

    // make the compiler think we're assigning a value to this variable
    doNothing(x_do_nothing);

    // print the value of x to the screen (who knows what we'll get, because x is uninitialized)
    std::cout << x_do_nothing;
    return 0;
}
