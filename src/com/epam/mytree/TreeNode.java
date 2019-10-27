package com.epam.mytree;

public class TreeNode<T> {
    private T data;
    private TreeNode Left;
    private TreeNode right;

    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.Left = left;
        this.right = right;
    }

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public TreeNode getLeft() {
        return Left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLeft(TreeNode left) {
        this.Left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
