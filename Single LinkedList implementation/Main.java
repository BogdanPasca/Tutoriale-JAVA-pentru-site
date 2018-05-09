package com.company;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe = new Employee("John", "Doe",4567);
        Employee marySmith = new Employee("Mary","Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.adToFront(janeJones);
        list.adToFront(janeJones);
        list.adToFront(marySmith);
        list.adToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();


    }
}