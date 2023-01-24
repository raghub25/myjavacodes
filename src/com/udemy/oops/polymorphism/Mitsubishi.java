package com.udemy.oops.polymorphism;
//        The other three classes mentioned above are sub-classes of Car. These classes have no member variables and the
//        constructor for each will call the parent constructor for object instantiation. Each of these classes will
//        override the three parent methods startEngine, accelerate, and brake. The return messages for these methods
//        should somewhere contain the name of the class to which the methods belong.

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }
    public String brake(){
        return "Mitsubishi -> brake()";
    }
}
