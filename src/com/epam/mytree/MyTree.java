package com.epam.mytree;


public class MyTree<T> {

    private TreeNode root;

    public MyTree() {
        root = null;
    }

    public void add(T data) {
        TreeNode current = root;
        while (true) {
            if (current == null) {
                root = new TreeNode<>(data);
                return;
            }
            if ((((Comparable) data).compareTo(current.getData()) < 0)) {//если значение того что мы хотим вставить меньше
                if (current.getLeft() == null) {
                    current.setLeft(new TreeNode<>(data));
                    return;
                } else {
                    current = current.getLeft();
                }
            } else if ((((Comparable) data).compareTo(current.getData()) > 0)) {
                if (current.getRight() == null) {
                    current.setRight(new TreeNode<>(data));
                    return;
                } else {
                    current = current.getRight();
                }
            }
        }
    }

    public String showString() {
        return showString(root);
    }

    private String showString(TreeNode<T> current) {
        StringBuilder result = new StringBuilder();
        if (current != null) {
            result.append(current.getData() + " ");
            if (current.getLeft() != null) {
                result.append(showString(current.getLeft()));
            }
            if (current.getRight() != null) {
                result.append(showString(current.getRight()));
            }
        }
        return result.toString();
    }

    public void removeData(T data) {
        TreeNode beforeFound = find(data);
        if (beforeFound == null) {
            return;
        }
        TreeNode found = root;
        if (beforeFound.getLeft().getData().equals(data)) {
            found = beforeFound.getLeft();
        } else {
            found = beforeFound.getRight();
        }
        if (found.getRight() == null && found.getLeft() == null) {
            if (beforeFound.getLeft().getData().equals(data)) {
                beforeFound.setLeft(null);
            } else {
                beforeFound.setRight(null);
            }
        }
        if (found.getRight() == null && found.getLeft() != null) {
            beforeFound.setLeft(found.getLeft());
        }
        if (found.getRight() != null && found.getLeft() == null) {
            beforeFound.setLeft(found.getRight());
        }
        if (found.getRight() != null && found.getLeft() != null) {
            T dt=(delitebylist(found));
            if(dt!=null)
                found.setData(dt);
        }
    }



    private T delitebylist(TreeNode current) {
        current = current.getRight();
        TreeNode previous = null;
        while (current.getLeft() != null) {
            previous = current;
            current = current.getLeft();
        }
        if (current.getLeft() == null && current.getRight() == null) {
            if (previous.getLeft().getData().equals(current.getData())) {
                previous.setLeft(null);
                return (T) current.getData();
            } else {
                previous.setRight(null);
            }
        }else {
            previous.setLeft(current.getRight());
        }
       return (T) current.getData();
    }

    private TreeNode<T> find(T data) {
        TreeNode current = root;
        TreeNode previous = null;
        while (true) {
            if (current == null) {
                return null;
            }
            if (data.equals(current.getData())) {
                return previous;
            }
            if ((((Comparable) data).compareTo(current.getData()) < 0)) {//если значение того что мы хотим вставить меньше
                {
                    previous = current;
                    current = current.getLeft();
                }
            } else if ((((Comparable) data).compareTo(current.getData()) > 0)) {
                previous = current;
                current = current.getRight();
            }
        }
    }
}
