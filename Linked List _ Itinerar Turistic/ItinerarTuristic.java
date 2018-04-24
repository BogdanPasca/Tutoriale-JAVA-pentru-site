package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ItinerarTuristic {
    public static void main(String[] args) {
        LinkedList<String> locuriDeVizitat = new LinkedList<>();
        adaugaInOrdine(locuriDeVizitat,"Targu Mures");
        adaugaInOrdine(locuriDeVizitat,"Cluj");
        adaugaInOrdine(locuriDeVizitat,"Sibiu");
        adaugaInOrdine(locuriDeVizitat,"Brasov");
        adaugaInOrdine(locuriDeVizitat,"Oradea");
        adaugaInOrdine(locuriDeVizitat,"Deva");
        adaugaInOrdine(locuriDeVizitat,"Arad");
        adaugaInOrdine(locuriDeVizitat, "Timisoara");


        printeazaLista(locuriDeVizitat);

        visit(locuriDeVizitat);


    }

    private static void printeazaLista(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("In vizita acum la: " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean adaugaInOrdine(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                //equal, do not add
                System.out.println( newCity  + " se afla deja in lista");
                return false;
            } else if (comparison > 0){
                //new city should apear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0){
                //move on next city
            }

        }
            stringListIterator.add(newCity);
        return true;
    }

    private static void visit (LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
        } else {
            System.out.println("In vizita acum la: " + listIterator.next());
            printeazaMeniu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacanta s-a terminat!:(");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("In vizita acum la: " + listIterator.next());
                    } else {
                        System.out.println("Am ajuns la sfarsitul listei");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                    System.out.println("Now visiting " + listIterator.previous());
                    } else{
                        System.out.println("Suntem la inceputul listei");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printeazaMeniu();
                    break;
            }
        }
    }

    private static void printeazaMeniu(){
        System.out.println("Optiuni disponibile:\napasa:");
        System.out.println("0 - pentru a iesi din program;");
        System.out.println("1 - pentru a vizita urmatorul oras;");
        System.out.println("2 - pentru a vizita orasul anterior;");
        System.out.println("3 - printeaza optiunile.\n");
    }
}
