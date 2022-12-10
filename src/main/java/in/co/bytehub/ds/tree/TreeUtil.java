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
}
