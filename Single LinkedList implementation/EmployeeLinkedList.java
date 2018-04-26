package com.company;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void adToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD ->");
        while(current !=null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty(){
        return head== null;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }
}
