package in.co.bytehub.ds.tree;

import java.util.StringJoiner;

public class BinaryTreeNode {

    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public BinaryTreeNode setData(int data) {
        this.data = data;
        return this;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode setLeft(BinaryTreeNode left) {
        this.left = left;
        return this;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public BinaryTreeNode setRight(BinaryTreeNode right) {
        this.right = right;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BinaryTreeNode.class.getSimpleName() + "[", "]")
                .add("data=" + data)
                .toString();
    }

    public Integer size() {
        return size(this);
    }
    private Integer size(BinaryTreeNode root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
}
