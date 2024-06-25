package com.cbfacademy.shapes;


abstract class Shape {
  
  protected String name;

  abstract double getArea();
  
  public String getName() {
    return this.name;
  };
}

/*abstract double getArea() - returns the area of the shape
String getName() - returns the name of the shape
In the same package, create a concrete class Sphere that extends Shape:

Sphere(double radius) - constructor
double getArea() - overrides the base method. The value is given by the formula (4 * 𝛑 * (radius2))
In the same package, create a concrete class Rectangle that extends Shape:

Rectangle(double length, double width) - constructor
double getArea() - overrides the base method. The value is given by the formula (length * width)
In the same package, create a concrete class Cylinder that extends Shape:

Cylinder(double radius, double height) - constructor
double getArea() - overrides the base method. The value is given by the formula (height * 𝛑 * (radius2)). */