#include <array>
#include <iostream>
#include <string_view>
#include <tuple>
#include <type_traits>

namespace a::b::c
{
    inline constexpr std::string_view str{ "hello" };
}

template <class... T>
std::tuple<std::size_t, std::common_type_t<T...>> sum(T... args)
{
    return { sizeof...(T), (args + ...) };
}

int main()
{
    int age{};
    auto [iNumbers, iSum] {sum(3, 2, 1, 4, 1, 0, 1, 1, 1, 2, 1)};
    std::cout << a::b::c::str << '\n';
    std::cout << "size of the first array: " << iNumbers << '\n';
    std::cout << "The Sum is: " << iSum << '\n';
    std::array arr{ 1, 2, 3, 7 };
    std::cout << "The size of the second array: " << std::size(arr) << '\n';
    std::cout << "Enter a number \n";
    std::cin >> age;
    std::cout << "The age you entered is : " << age << '\n';
    std::cout << "============================= \n";
    return 0;
}
