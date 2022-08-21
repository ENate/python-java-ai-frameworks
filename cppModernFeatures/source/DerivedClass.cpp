#include "baseclass/DerivedClass.h"

namespace derivedclass {
    // Implement no args constructor by delegating to superclass

    DerivedClass::DerivedClass() : BaseClass () {}
    DerivedClass::DerivedClass(int argsAge) : age{argsAge} {}

    DerivedClass::DerivedClass(int argage, std::string namearg, std::string usernameargs, std::string sname)
    : BaseClass(sname), age{argage}, names{namearg}, username{usernameargs}
    {

    }
    // Some overload double constructor
    DerivedClass::DerivedClass(double realrgs, double imgarg) : realpart{realrgs}, imgPart{imgarg} {}
    DerivedClass::DerivedClass(const DerivedClass& lhs) : BaseClass(lhs),
        age{lhs.age},
        username{lhs.username},
        names{lhs.names} {

        }
    // Copy assignment
    DerivedClass& DerivedClass::operator=(const DerivedClass& lhs) {
        BaseClass::operator=(lhs);
        age = lhs.age;
        names = lhs.names;
        username = lhs.username;
        return *this;
    }
    // Move semantics
    DerivedClass::DerivedClass(DerivedClass&& lhss) : BaseClass(lhss),
        age{std::move(lhss.age)},
        names{std::move(lhss.names)},
        username{std::move(lhss.username)}
        {

        }

    DerivedClass::DerivedClass(DerivedClass&& lhss)
    {
        BaseClass::operator=(std::move(lhss));
        age = std::move(lhss.age);
        names = std::move(lhss.names);
        username = std::move(lhss.username);
    }

    // firend operator+ impl
    DerivedClass& derivedclass::operator+(DerivedClass& a, DerivedClass& b)
      {
         double aSum = a.realpart + b.realpart;
         double bSum = b.imgPart + b.imgPart;
         std::cout << "The real part is: " << aSum << '\n';
         std::cout << "The real part is: " << bSum << '\n';
      }
}