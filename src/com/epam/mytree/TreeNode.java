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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreeNode<?> treeNode = (TreeNode<?>) o;

        if (data != null ? !data.equals(treeNode.data) : treeNode.data != null) return false;
        if (Left != null ? !Left.equals(treeNode.Left) : treeNode.Left != null) return false;
        return right != null ? right.equals(treeNode.right) : treeNode.right == null;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (Left != null ? Left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
