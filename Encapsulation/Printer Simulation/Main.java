package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(40,5000,false);


        System.out.println(printer.getTonerLevel());
        printer.fillTonner(10);
        printer.printPages(1000);
        System.out.println(printer.getTonerLevel());
        printer.fillTonner(100);
        System.out.println(printer.getTonerLevel());
        printer.printPages(2000);
        printer.fillTonner(100);
        System.out.println(printer.getTonerLevel());
        printer.printPages(150);












    }
}
