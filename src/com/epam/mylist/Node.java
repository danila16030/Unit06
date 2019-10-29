package com.epam.mylist;

public class Node<T> {
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
    public Node(T data,Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        if (data != null ? !data.equals(node.data) : node.data != null) return false;
        return next != null ? next.equals(node.next) : node.next == null;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
