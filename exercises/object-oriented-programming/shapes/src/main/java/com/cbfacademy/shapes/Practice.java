package com.cbfacademy.shapes;

public class Practice {
  

    public  static void main(String[] args) {
        Paint paint = new Paint(10.0);
        Shape deck = new Rectangle(35, 20);
        System.out.println("paint needed for the rectangular deck is " + paint.getAmount(deck) + "gallions");

        Shape ball = new Sphere(15);
        System.out.println("paint needed for ball is " + paint.getAmount(ball) + "gallions");
        
        Shape tank = new Cylinder(10, 30);
        System.out.println("paint needed for the tank is " + paint.getAmount(tank) + "gallions");


    }
    
}
/*a rectangular deck of length 35 and width 20
a ball of radius 15
a tank of radius 10 and height 30.
Consider the following ideas:

print the amount of paint needed for each item
print the overall amount of paint needed to the screen */
