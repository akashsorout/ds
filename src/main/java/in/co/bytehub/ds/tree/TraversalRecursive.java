package in.co.bytehub.ds.tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalRecursive {

    public static void main(String[] args) {
        BinaryTreeNode root = TreeUtil.createSampleTree();

        System.out.print("PreOrder           : \t");
        preOrder(root);
        System.out.println("");
        System.out.print("PostOrder          : \t");
        postOrder(root);
        System.out.println("");
        System.out.print("InOrder            : \t");
        inOrder(root);
        System.out.println("");
        System.out.print("BFS                : \t");
        bfs(root);
        System.out.println("");
        System.out.print("BFS Reverse Bottom to top       : \t");
        printLevelOrderInReverse(root);
        System.out.println("");
        System.out.println("\nCalculate Height : \t" + calHeight(root));

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

    public static Integer calHeight(BinaryTreeNode root) {
        if (root == null) return 0;
        Integer left = calHeight(root.getLeft());
        Integer right = calHeight(root.getRight());
        return right > left ? ++right : ++left;
    }

    public static void printLevelOrderInReverse(BinaryTreeNode root) {
        if(root == null) return;
        Stack<Integer> stack = new Stack<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        stack.push(root.getData());
        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.poll();
            if( currentNode != null) {
                if(currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                    stack.push(currentNode.getRight().getData());
                }
                if(currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                    stack.push(currentNode.getLeft().getData());
                }
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + "\t");
        }
    }
}
