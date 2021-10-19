#include <iostream>
// Object-like Macro using substitution text
// Object-like macros were used as a cheaper alternative to constant variables.
// Those times are long gone as compilers got smarter and the language grew.
// Object-like macros should only be seen in legacy code anymore.
#define BOTANIST "Carolus Linnaeus"
int main()
{
    std::cout << "The Macro value is the Swedish Botanist named: " << BOTANIST << '\n';
    return 0;
}
