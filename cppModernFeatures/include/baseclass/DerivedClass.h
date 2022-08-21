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

            // Getters and setters
            double getReal() const;
            void setReal(double realpart);
            double getImg() const;
            void setImg(double imgpart);
            // copy assignment
            DerivedClass& operator=(const DerivedClass& lhs);
            // move semantics
            DerivedClass(DerivedClass&& lhss);
            DerivedClass& operator=(DerivedClass&& lhss) noexcept;

            // norms
            void printHey();

            // some complex num operator
            friend DerivedClass operator+(const DerivedClass& a, const DerivedClass& b);
            friend DerivedClass operator-(const DerivedClass& areal, const DerivedClass& bImg);
            friend DerivedClass operator*(const DerivedClass& xreal, const DerivedClass& yreal);
            friend std::ostream& operator<<(std::ostream& os, const DerivedClass& dt);
    };
}
#endif