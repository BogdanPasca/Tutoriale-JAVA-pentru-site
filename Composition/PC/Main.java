package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(30, 30, 5);
        Case theCase = new Case("123", "Dell", "340", dimensions);
        Monitor monitor = new Monitor("Elite Display", "Hp", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200","Assus",4,6,"v2.55");

        PC thePC = new PC(theCase,monitor,motherboard);

        thePC.getTheCase().pressPowerButton();
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getMonitor().drawPixelAt(1500,1200,"red");



    }
}
