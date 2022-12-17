package in.co.bytehub.ds.tree;

public class TreeUtil {

    public static BinaryTreeNode createSampleTree() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode rootL = new BinaryTreeNode(2);
        BinaryTreeNode rootR = new BinaryTreeNode(3);
        BinaryTreeNode rootLL = new BinaryTreeNode(4);
        BinaryTreeNode rootLR = new BinaryTreeNode(5);
        BinaryTreeNode rootRL = new BinaryTreeNode(6);
        BinaryTreeNode rootRR = new BinaryTreeNode(7);
        root.setLeft(rootL);
        root.setRight(rootR);
        rootL.setLeft(rootLL);
        rootL.setRight(rootLR);
        rootR.setLeft(rootRL);
        rootR.setRight(rootRR);
        return root;
    }

    public static BinaryTreeNode createTree(int nuOfNodes) {
        BinaryTreeNode root = null;
        for (int i = 1; i <=nuOfNodes; i++) {
            root = insertNode(root, i);
        }
     return root;
    }

    private static BinaryTreeNode insertNode(BinaryTreeNode root, int data) {
        if (root == null) return new BinaryTreeNode(data);
        if (root.getLeft() == null) {
            root.setLeft(new BinaryTreeNode(data));
        } else if (root.getRight() == null) {
            root.setRight(new BinaryTreeNode(data));
        }
        else {
            insertNode(root.getLeft(), data);
        }
        return root;
    }
}
