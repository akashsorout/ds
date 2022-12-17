package in.co.bytehub.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSize {

    public static void main(String[] args) {

        BinaryTreeNode rootNode = TreeUtil.createTree(10);
        BinaryTreeNode sampleTree = TreeUtil.createSampleTree();

        System.out.println("size = " + rootNode.size());
        System.out.println("size = " + sampleTree.size());

        System.out.println("size = " + calculateSizeWithOutRecursion(rootNode));
        System.out.println("size = " + calculateSizeWithOutRecursion(sampleTree));
    }

    private static Integer calculateSizeWithOutRecursion(BinaryTreeNode root) {
        if(root == null) return 0;
        Integer counter = 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.poll();
            if(currentNode != null) {
                counter++;
                if(currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if(currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            }
        }
        return counter;
    }
}
