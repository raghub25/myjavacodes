package com.udemy.oops.composition;

//Directions:
//
//        this is an exercise in Class Composition. to complete the exercise, you must create five classes with associated member variables and
//        //methods. The five classes should be created as follows:
//        1) Create a class and name it Lamp. Inside this class should be declared three member variables: style of type String, battery of
//        type boolean, and globRating of type int. All variables should be marked private. A constructor needs to be created which
//        accepts the three member variables as parameters.
//        In addition, four methods should also be created: turnOn() has no return type and should print a message that the lamp is
//        being turned on; getStyle() returns the lamp style; isBattery returns the value of battery; and getGlobRating()
//        returns the globRating of the lamp.

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }
    public boolean isBattery(){
        return this.battery;
    }
    public void turnOn(){
        System.out.println("Lamp --> Turning on");
    }
}
