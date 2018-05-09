package com.company;

public class Main {

    public static void main(String[] args) {
        Telephone tel1;
        tel1 = new DeskPhone("0265255240");
        tel1.powerOn();
        tel1.callPhone("0265255240");
        tel1.answer();

        System.out.println("###################################");

        tel1 = new MobilePhone("0723456123");
        tel1.powerOn();
        tel1.callPhone("0723908434");
        tel1.answer();

    }
}
