#include <doctest/doctest.h>
#include "inheritance/BaseClass.h"
#include <inheritance/version.h>

#include <string>

TEST_CASE("BaseClass") {
  using namespace inheritance;

  Greeter greeter("Tests");

  CHECK(BaseClass.printMessage(LanguageCode::EN) == "Hello, Tests!");
  CHECK(BaseClass.printMessage(LanguageCode::DE) == "Hallo Tests!");
  CHECK(BaseClass.printMessage(LanguageCode::ES) == "¡Hola Tests!");
  CHECK(BaseClass.printMessage(LanguageCode::FR) == "Bonjour Tests!");
}

TEST_CASE("BaseClass version") {
  static_assert(std::string_view(BASECLASS_VERSION) == std::string_view("1.0"));
  CHECK(std::string(BASECLASS_VERSION) == std::string("1.0"));
}
