package com.company;

public class Printer {
    private double tonerLevel;
    private int noPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int noPagesPrinted, boolean isDuplex) {
        if ( tonerLevel > -1 && tonerLevel <=100){
        this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.noPagesPrinted = noPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public double getTonerLevel() {
        System.out.print("Nivel toner: ");
        return tonerLevel;
    }

    public int getNoPagesPrinted() {
        return noPagesPrinted;
    }


    // nivelul tonerului este maxim 100
    public void fillTonner(int procent) {
        double level = 0;
        if (this.tonerLevel == 100) {
            level = 100;
            System.out.println("Nivelul tonerului este la maxim. Nu se mai poate adauga.");
        } else if (this.tonerLevel + procent > 100) {
            System.out.println("Cantitatea adaugata este prea mare. Cantitatea maxima admisa 100. Cantitate de toner ramasa: " + tonerLevel);
            level = tonerLevel;
        } else {
            level = this.tonerLevel += procent;
            System.out.println("Au fost adaugate cu succes " + procent + " unitati toner. Noua cantitate de toner: " + level);
        }
    }

    // metoda care printeaza pagini la imprimanta
    // un toner de 100 unitati printeaza 2000 de pagini.
    // se consuma 0.05 unitati toner/pagina
    // cu fiecare pagina printata scad unitatile din toner.
    // cand tonerul este < 0 nu se mai pot printa pagini
    public void printPages(int number) {
        this.noPagesPrinted += number;
        if ((tonerLevel - (number * 0.05)) >= 0) {
            System.out.print("Au fost printate " + number + " pagini. ");
            tonerLevel = tonerLevel - (number * 0.05);
            System.out.println("Toner ramas: " + tonerLevel);
        } else {
            System.out.println("Toner insuficient pentru a printa paginile.");
        }
    }
}
