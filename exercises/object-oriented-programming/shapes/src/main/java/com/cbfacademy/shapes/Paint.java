package com.cbfacademy.shapes;

public class Paint {

    protected double coverage;

public Paint(double coverage){
    this.coverage = coverage;
}

public double getAmount(Shape shape){
  double shapes = shape.getArea();
    return shapes/coverage;
}
}




/* Paint(double coverage) - constructor that accepts a parameter representing the number of square feet per gallon this paint can cover
getAmount(Shape shape) - returns the amount of paint (measured in gallons) needed to paint a given shape
 */
