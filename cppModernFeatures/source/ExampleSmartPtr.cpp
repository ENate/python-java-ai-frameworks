// Define all constructors

#include "baseclass/ExampleSmartPtrs.h"

namespace examplesmartptr {
    // No args constructor

    ExampleSmartPtr::ExampleSmartPtr()
    {
        someObj = std::shared_ptr<DerivedClass>(new DerivedClass());
    }
    ExampleSmartPtr::ExampleSmartPtr(std::shared_ptr<DerivedClass> deePtr) :
    someObj{deePtr} {}
    // Implement getter
    std::shared_ptr<DerivedClass> ExampleSmartPtr::getDerived() const
    {
        return someObj;
    }

    // Implement methods
    void ExampleSmartPtr::demonstrateSharedPtr()
    {
        ExampleSmartPtr* ex1 = new ExampleSmartPtr();
        std::shared_ptr<DerivedClass> pderived = ex1->getDerived();
        pderived->printHey();
        return;

    }
}