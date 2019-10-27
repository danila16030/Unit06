package com.epam.mylist;

public class MyList<T> {

    private Node first;
    private int size;

    public MyList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addAtEnd(T data) {
        Node current = first;
        if (current == null) {
            first = new Node<>(data);
            size++;
            return;
        }

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node<>(data));
        size++;
    }

    public void addAtIndex(int index,T data) {
        Node current = first;

        while (current != null && index-- > 0) {
            current = current.getNext();
        }
        current.setNext(new Node<>(data,current.getNext()));
        size++;
    }


    public void addMassive(T[] array) {
        for (T data : array) {
            addAtEnd(data);
        }
    }

    public void removeData(T data) {
        Node previous = null;
        Node current = first;

        while (current != null) {
            if (current.getData().equals(data)) {
                if (previous == null) {
                    first = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public void deleteAtIndex(int index) {
        Node previous = null;
        Node current = first;
        while (current != null && index-- > 0) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(current.getNext());
    }

    public String getStringOfList() {
        StringBuilder result = new StringBuilder();
        Node current = first;
        while (current != null) {
            result.append(current.getData() + " ");
            current = current.getNext();
        }
        return result.toString();
    }
}
