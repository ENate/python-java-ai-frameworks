// Define all constructors

#include "baseclass/ExampleSmartPtrs.h"

namespace examplesmartptr {
    // No args constructor

    ExampleSmartPtr::ExampleSmartPtr()
    {
        someObj = std::shared_ptr<DerivedClass>(new DerivedClass());
    }
    // Derivedclass only raw pointer initialization
    ExampleSmartPtr::ExampleSmartPtr(DerivedClass* somePtr) : dPtr{somePtr} {}

    // Raw pointer cpy const
    ExampleSmartPtr::ExampleSmartPtr(ExampleSmartPtr const& other) :
    dPtr{other.dPtr ? new DerivedClass{*other.dPtr} : nullptr} {}

    // cpy assignment
    ExampleSmartPtr& ExampleSmartPtr::operator=(ExampleSmartPtr const& other)
    {
        if (dPtr && other.dPtr)
        {
            *dPtr = *other.dPtr;
            // for move operator:
            // dPtr = std::exchange(other.dPtr, {})
        }
        else {
        ExampleSmartPtr temp(other);
        swap(temp);
        }
        // For move: ExampleSmartPtr(std::move(other))
        // swap(other)

        return *this;
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
    void ExampleSmartPtr::swap(ExampleSmartPtr& other)
    {
        using std::swap; // non-qualified call to swap
        swap(dPtr, other.dPtr);
    }
    ExampleSmartPtr::~ExampleSmartPtr()
    {
        //delete dPtr;
        //delete temp;
    }
}