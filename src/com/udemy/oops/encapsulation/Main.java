package com.udemy.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer print = new Printer(50,false);
        System.out.println("Pages printed "+print.printPages(5));
        System.out.println("New pages count "+print.getPagesPrinted());
        //System.out.println("Toner filled to "+print.fillUpToner(10));
    }
}
