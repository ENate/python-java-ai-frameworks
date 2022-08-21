#ifndef EXAMPLESMARTPTR_H
#define EXAMPLESMARTPTR_H
#include "DerivedClass.h"
#include <memory>

using namespace derivedclass;

namespace examplesmartptr {

    class ExampleSmartPtr {

        private:
            int myage;
            // create object of derived class as shared pointer
            std::shared_ptr<DerivedClass> someObj;
        public:
            ExampleSmartPtr();
            ExampleSmartPtr(std::shared_ptr<DerivedClass> deePtr);
            // Getter
            std::shared_ptr<DerivedClass> getDerived() const;
            void demonstrateSharedPtr();



    };
}
#endif