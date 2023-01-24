package com.udemy.interfaces;
//3. Monster (class)
//
//          - It has three fields. One String called name and Two ints called hitPoints and strength.
//
//          - A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and
//          strength with the newly passed in values.
//
//          - And six methods:
//
//            - Only getters for the three fields.
//
//            - write(), same as interface. Return a List of the fields in the order they appear in toString().
//
//            - read(), same as interface. Store the values in the List, in the order they appear in toString().
//            Make sure the List is not null and the size() is greater than 0 before storing the values.
//
//            - toString(), Monsters overriding toString() method. It takes no arguments and returns a String in the following format:
//
//        Monster{name='Werewolf', hitPoints=20, strength=40}

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0,this.name);
        list.add(1,""+this.hitPoints);
        list.add(2,""+this.strength);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty() && list.size() > 0) {
            this.name=list.get(0);
            this.hitPoints= Integer.parseInt(list.get(1));
            this.strength= Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
