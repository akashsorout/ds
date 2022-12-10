package in.co.bytehub.ds.tree;


import java.util.LinkedList;
import java.util.Queue;

public class TraversalApp {

    public static void main(String[] args) {
        BinaryTreeNode root = TreeUtil.createSampleTree();

        System.out.print("PreOrder           : \t"); preOrder(root); System.out.println("");
        System.out.print("PostOrder          : \t"); postOrder(root); System.out.println("");
        System.out.print("InOrder            : \t"); inOrder(root); System.out.println("");
        System.out.print("BFS                : \t");bfs(root);
        System.out.println("\nCalculate Height : \t" + calHeight(root, 0));

    }

    public static void bfs(BinaryTreeNode root) {
        if (root == null) return;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode curr = queue.poll();
            System.out.print(curr.getData() +"\t");

            BinaryTreeNode left = curr.getLeft();
            if(left != null)queue.offer(left);

            BinaryTreeNode right = curr.getRight();
            if(right != null) queue.offer(right);
        }
    }

    public static void preOrder(BinaryTreeNode root) {
        if (root == null) return;
        System.out.print(root.getData()+"\t");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public static void postOrder(BinaryTreeNode root) {
        if (root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + "\t");
    }
    public static void inOrder(BinaryTreeNode root) {
        if (root == null) return;
        inOrder(root.getLeft());
        System.out.print(root.getData() + "\t");
        inOrder(root.getRight());
    }

    public static Integer calHeight(BinaryTreeNode root, Integer current) {
        if (root == null) return 0;
        Integer left = calHeight(root.getLeft(), current);
        Integer right = calHeight(root.getRight(), current);
        return right > left ? ++right : ++left;
    }
}
