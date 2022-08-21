#include <fmt/format.h>
#include "baseclass/BaseClass.h"

namespace baseclass {

BaseClass::BaseClass() {}

// Copy Constructor

BaseClass::BaseClass(std::string& namearg) : name{namearg} {}

// copy base class constructor
BaseClass::BaseClass(const BaseClass& brhs) : name{brhs.name}
{

}
BaseClass& BaseClass::operator=(const BaseClass& rhs)
{
  name = rhs.name;
}
BaseClass::BaseClass(BaseClass&& brhs) : name{std::move(brhs.name)}
{

}
BaseClass& BaseClass::operator=(BaseClass&& rhs)
{
  name = std::move(rhs.name);
}
BaseClass::BaseClass(std::string& _name) : name(std::move(_name)) {}

std::string BaseClass::printMessage(LanguageCode lang) const {
  switch (lang) {
    default:
    case LanguageCode::EN:
      return fmt::format("Hello, {}!", name);
    case LanguageCode::DE:
      return fmt::format("Hallo {}!", name);
    case LanguageCode::ES:
      return fmt::format("¡Hola {}!", name);
    case LanguageCode::FR:
      return fmt::format("Bonjour {}!", name);
  }
}
}
