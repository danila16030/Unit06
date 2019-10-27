package com.epam.mylist;

public class Main {
    public static void main(String[] args) {
        MyList myListLogic = new MyList();

        myListLogic.addAtEnd("a");
        myListLogic.addAtEnd("b");
        myListLogic.addAtEnd("a");
        myListLogic.removeData("a");
        for (int i = 0; i < 20; i++) {
            myListLogic.addAtEnd(i);
        }
        myListLogic.deleteAtIndex(2);
        myListLogic.addAtIndex(1,"A");
        System.out.println(myListLogic.getStringOfList());
    }
}
