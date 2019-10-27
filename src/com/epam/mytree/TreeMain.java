package com.epam.mytree;

public class TreeMain {
    public static void main(String[] args) {
        MyTree<Integer> myTree = new MyTree<Integer>();
        myTree.add(10);
       myTree.add(9);
        myTree.add(1);
        myTree.add(0);
        myTree.add(5);
        myTree.add(2);
        myTree.add(3);
        myTree.removeData(1);
        System.out.println(myTree.showString());

    }
}
