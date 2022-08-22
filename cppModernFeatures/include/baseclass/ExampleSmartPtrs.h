#ifndef EXAMPLESMARTPTR_H
#define EXAMPLESMARTPTR_H
#include "DerivedClass.h"
#include <memory>

using namespace derivedclass;

namespace examplesmartptr {

    class ExampleSmartPtr {

        private:
        // unique ptrs perfectly implement only moves
        // But not cpy const
        // shared ptrs change class semantics
            int myage;
            // create object of derived class as shared pointer
            DerivedClass* dPtr{};
            // Must implement cpy for unique ptr!!!!
            std::shared_ptr<DerivedClass> someObj;
            // Shared ptrs changes semantics of class: shared ownership
            // troublesome at times: shared pointers. can be copied and cleaned up!!
        public:
            ExampleSmartPtr();
            ExampleSmartPtr(DerivedClass* argPtr);
            // Define Klaus's copy cons
            ExampleSmartPtr(ExampleSmartPtr const& other);
            ExampleSmartPtr(std::shared_ptr<DerivedClass> deePtr);
            ~ExampleSmartPtr();
            // Some cpy assignment
            ExampleSmartPtr& operator=(ExampleSmartPtr const& other);
            // Getter
            std::shared_ptr<DerivedClass> getDerived() const;
            void demonstrateSharedPtr();
            void swap(ExampleSmartPtr& other);
    };
}
#endif