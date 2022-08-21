#include "baseclass/DerivedClass.h"

namespace derivedclass {
    // Implement no args constructor by delegating to superclass

    DerivedClass::DerivedClass() : BaseClass () {}
    DerivedClass::DerivedClass(int argsAge) : age{argsAge} {}

    DerivedClass::DerivedClass(int argage, std::string namearg, std::string usernameargs, std::string sname)
        : BaseClass(sname),
        age{argage},
        names{namearg},
        username{usernameargs}
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

    DerivedClass& DerivedClass::operator=(DerivedClass&& lhss) noexcept
    {
        BaseClass::operator=(std::move(lhss));
        age = std::move(lhss.age);
        names = std::move(lhss.names);
        username = std::move(lhss.username);
        return *this;
    }

    // firend operator+ impl
    DerivedClass operator+(const DerivedClass& a, const DerivedClass& b)
      {
         double aSum = a.getReal() + b.getReal();
         double bSum = b.getImg() + b.getImg();
         // DerivedClass& ampValue(aSum, bSum);
         return DerivedClass(aSum, bSum);
      }

      DerivedClass operator-(const DerivedClass& areal, const DerivedClass& bimg)
      {
         double aSum = areal.getReal() - bimg.getReal();
         double bSum = areal.getImg() - bimg.getImg();
         // DerivedClass& ampValue(aSum, bSum);
         return DerivedClass(aSum, bSum);
      }

      DerivedClass operator*(const DerivedClass& xreal1, const DerivedClass& yreal2)
      {
        double xxreal = xreal1.getReal() * yreal2.getReal() - xreal1.getImg() * yreal2.getImg();
        double yyreal = xreal1.getImg() * yreal2.getReal() + xreal1.getReal() * yreal2.getImg();
        return DerivedClass(xxreal,  yyreal);
      }

      std::ostream& operator<<(std::ostream& os, const DerivedClass& dt)
      {
        return os << "(" << dt.getReal() << "," << dt.getImg() << ")";
      }



    double DerivedClass::getReal() const
    {
        return realpart;
    }

    void DerivedClass::setReal(double realpartargs)
    {
        realpart = realpartargs;
    }

    double DerivedClass::getImg() const
    {
        return imgPart;
    }

    void DerivedClass::setImg(double imgargs)
    {
        imgPart = imgargs;
    }
}