// Demonstrating use of condition compilation based on  defining
// object-like macros without text

// e #define directive can be used to create a macro. It is a rule
//that defines how input text is converted into replacement output text.
#include <iostream>

#define PRINT_JOE // without substitution text
int main()
{
    // if PRINT_JOE is defined, compile this code
#ifdef PRINT_JOE
    std::cout << "The Joe Macro is defined \n";
#endif
    // if PRINT_MARY is defined, compile this code
#ifdef PRINT_MARY
    std::cout << "The Mary Macro is defined\n";
#endif
    //prints “Bob”, because PRINT_BOB was never #defined.
#ifndef PRINT_JULES
    std::cout << "Prints undefined Jules \n";
#endif
    return 0;
}
// Other syntax ways:
//#if defined(PRINT_BOB) and #if !defined(PRINT_BOB)
