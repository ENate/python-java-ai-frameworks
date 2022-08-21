#ifndef DERIVEDCLASS_H
#define DERIVEDCLASS_H

#include "BaseClass.h"

namespace derivedclass {

    class DerivedClass : public baseclass::BaseClass {

        private:
            int age;
            double realpart;
            double imgPart;
            std::string names;
            std::string username;
        public:
            DerivedClass();
            DerivedClass(int argsAge);
            DerivedClass(double realargs, double imgargs);
            DerivedClass(const DerivedClass& drhs);
            DerivedClass(int argage, std::string namearg, std::string usernameargs, std::string sname);

            // copy assignment
            DerivedClass& operator=(const DerivedClass& lhs);
            // move semantics
            DerivedClass(DerivedClass&& lhss);
            DerivedClass& operator=(DerivedClass&& lhss);

            // some complex num operator
            friend DerivedClass& operator+(DerivedClass& a, DerivedClass& b);
    };
}
#endif