
package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public String getDetails() {
        return String.format("%s %s %s (%d)", colour, make, model, year);
    }
}


   // Car Volvo = new Car("Volvo", "V40", 2012, "Blue");
   // Volvo.getColour();
   // Volvo.setColour("green");


/*reate a class called `Showroom` with the following members:
- `public List<Car> getCars()` - returns a list containing the following three `Car` objects:
  - a blue Volvo V40 from 2012
  - a red Porsche Panamera from 2009
  - a grey Audi A3 from 2018
  */

//Car myCar = new Car(Audi, Audi, 1999, green);

