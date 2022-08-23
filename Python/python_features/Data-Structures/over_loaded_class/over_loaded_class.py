""" Define overloaded classes """
import math

class OverLoad:

    """ A class to overload constructors """
    def __init__(self, radius) :

        self.radius = radius

    def __str__(self):
        return f'({self.radius})'

    def area(self):
        """ compute area """
        return math.pi * self.radius ** 2

    def perimeter(self):
        """compute parameter """
        return 2 * math.pi * self.radius

    def __repr__(self):
        return f"{self.__class__.__name__}(radius={self.radius})"

    @classmethod
    def from_diameter(cls, diameter, pii):
        """ compute diameter and area of circle"""
        return cls(radius = diameter / 2), cls(pii * diameter / 2 )


names = OverLoad(67)
print(names)
