package in.co.bytehub.ds.tree;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TraversalIterative {

    public static void main(String[] args) {

        BinaryTreeNode root = TreeUtil.createSampleTree();
        System.out.print("PreOrder           : \t");
        preOrder(root);
        System.out.println();
        System.out.print("PostOrder          : \t");
        postOrder(root);
        System.out.println();
        System.out.print("PostOrder Mark visited node by  creating Pair         : \t");
        postOrder2MarkTheNode(root);
        System.out.println();
        System.out.print("PostOrder using 2 stacks         : \t");
        postOrder3DualStack(root);
        System.out.println();

        System.out.print("PostOrder using color marking         : \t");
        postOrder4ColorTheNodes(root);
        System.out.println();

        System.out.print("PostOrder without marking         : \t");
        postorderWithOutMarking(root);
        System.out.println();

        System.out.print("Inorder using marking: \t");
        inorderByMarking(root);
        System.out.println();


        System.out.print("Inorder without marking: \t");
        inorder2WithOutMarking(root);
        System.out.println();

//        System.out.print("InOrder            : \t"); inOrder(root); System.out.println("");
//        System.out.print("BFS                : \t");bfs(root); System.out.println("");
//        System.out.print("BFS Reverse Bottom to top       : \t");printLevelOrderInReverse(root); System.out.println("");
//        System.out.println("\nCalculate Height : \t" + calHeight(root));

    }

    public static void preOrder(BinaryTreeNode root) {
        if (null == root) return;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.pop();
            System.out.print(currentNode.getData() + "\t");

            // push right first and then left so that left process first and then right
            if (currentNode.getRight() != null) {
                stack.push(currentNode.getRight());
            }

            if (currentNode.getLeft() != null) {
                stack.push(currentNode.getLeft());
            }
        }

    }

    //    “I won’t tell my story until my kids tell theirs.”
    public static void postOrder(BinaryTreeNode root) {

        if (null == root) return;
        Stack<BinaryTreeNode> stack = new Stack<>();
        Set<BinaryTreeNode> visitedNodes = new HashSet<>();

        // First time visiting node – push children first
        // Second time – print value

        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.pop();
            if (!visitedNodes.contains(currentNode)) {
                visitedNodes.add(currentNode);
                stack.push(currentNode);
                if (currentNode.getRight() != null) {
                    stack.push(currentNode.getRight());
                }
                if (currentNode.getLeft() != null) {
                    stack.push(currentNode.getLeft());
                }
            } else {
                System.out.print(currentNode.getData() + "\t");
            }

        }
    }

    public static void postOrder2MarkTheNode(BinaryTreeNode root) {
        // Mark the node visited and avoid hashSet to track visited node as HashSet<>() may behave wrongly in case of equal() HashCode() and shared references
        // Or create Stack<Pair<Node, Boolean>> if modification in Node is not possible
        Stack<Pair<BinaryTreeNode, Boolean>> stack = new Stack<>();
        stack.push(new Pair<>(root, false));
        while (!stack.isEmpty()) {
            Pair<BinaryTreeNode, Boolean> currentNodePair = stack.pop();
            // if not visited
            if (!currentNodePair.getValue()) {
                BinaryTreeNode currentNode = currentNodePair.getKey();
                stack.push(new Pair<>(currentNode, true));
                if (null != currentNode.getRight()) {
                    stack.push(new Pair<>(currentNode.getRight(), false));
                }
                if (null != currentNode.getLeft()) {
                    stack.push(new Pair<>(currentNode.getLeft(), false));
                }
            } else {
                System.out.print(currentNodePair.getKey().getData() + "\t");
            }
        }
    }

    public static void postOrder3DualStack(BinaryTreeNode root) {
        // Use 2 stacks, First to prepare the resultant stack 2
        // print 2nd stack
        // But Algo is not truly post_order. It is a working hack model

        // The first stack (stack) is used to traverse the tree in a modified pre-order: root → right → left.
        //The second stack (resultStack) reverses this order to get left → right → root, which is post-order.
        if (root == null) return;
        Stack<BinaryTreeNode> stack = new Stack<>();
        Stack<BinaryTreeNode> resultStack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.pop();
            resultStack.push(currentNode);

            if (currentNode.getLeft() != null) {
                stack.push(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                stack.push(currentNode.getRight());
            }
        }
        while (!resultStack.isEmpty()) {
            System.out.print(resultStack.pop().getData() + "\t");
        }

    }

    public static void postOrder4ColorTheNodes(BinaryTreeNode root) {
        // It is very close to postOrder2MarkTheNode, But extensible for more complex states
        String WHITE = "WHITE"; // not ready
        String GREY = "GREY"; // ready to ship
        Stack<Pair<BinaryTreeNode, String>> stack = new Stack<>();
        stack.push(new Pair<>(root, WHITE));
        while (!stack.isEmpty()) {
            Pair<BinaryTreeNode, String> currentNode = stack.pop();
            if (WHITE.equals(currentNode.getValue())) {
                stack.push(new Pair<>(currentNode.getKey(), GREY));
                if (currentNode.getKey().getRight() != null) {
                    stack.push(new Pair<>(currentNode.getKey().getRight(), WHITE));
                }
                if (currentNode.getKey().getLeft() != null) {
                    stack.push(new Pair<>(currentNode.getKey().getLeft(), WHITE));
                }
            }
            if (GREY.equals(currentNode.getValue())) {
                System.out.print(currentNode.getKey().getData() + "\t");
            }
        }
    }

    public static void postorderWithOutMarking(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode current = root;
        BinaryTreeNode lastVisited = null;

        while (current != null || !stack.isEmpty()) {
            // Go as left as possible
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            BinaryTreeNode peekNode = stack.peek();

            // If right child exists and hasn't been visited, go right
            if (peekNode.getRight() != null && lastVisited != peekNode.getRight()) {
                current = peekNode.getRight();
            } else {
                // Visit the node
                System.out.print(peekNode.getData() + "\t");
                lastVisited = stack.pop();
            }
        }
    }


    public static void inorderByMarking(BinaryTreeNode root) {

        if (root == null) return;
        // node, state<processed, unprocessed>
        Stack<Pair<BinaryTreeNode, Boolean>> stack = new Stack<>();
        stack.push(new Pair<>(root, false));

        while (!stack.isEmpty()) {
            Pair<BinaryTreeNode, Boolean> currentNodeStatePair = stack.pop();
            BinaryTreeNode node = currentNodeStatePair.getKey();
            Boolean isProcessed = currentNodeStatePair.getValue();
            if (!isProcessed) {
                // right
                if (node.getRight() != null) {
                    stack.push(new Pair<>(node.getRight(), false));
                }
                // data
                stack.push(new Pair<>(node, true)); // current node has been processed now
                // left
                if (node.getLeft() != null) {
                    stack.push(new Pair<>(node.getLeft(), false));
                }
            } else {
                System.out.print(node.getData() + "\t");
            }
        }
    }

    public static void inorder2WithOutMarking(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current subtree
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            // Current is null at this point
            current = stack.pop();
            System.out.print(current.getData() + "\t");

            // Move to the right subtree
            current = current.getRight();
        }
    }

    // moris algorithm
    public static void inorderMorris(BinaryTreeNode root) {
        BinaryTreeNode current = root;

        while (current != null) {
            if (current.getLeft() == null) {
                System.out.print(current.getData() + "\t");
                current = current.getRight();
            } else {
                BinaryTreeNode predecessor = current.getLeft();
                while (predecessor.getRight() != null && predecessor.getRight() != current) {
                    predecessor = predecessor.getRight();
                }

                if (predecessor.getRight() == null) {
                    predecessor.setRight(current); // create thread
                    current = current.getLeft();
                } else {
                    predecessor.setRight(null); // remove thread
                    System.out.print(current.getData() + "\t");
                    current = current.getRight();
                }
            }
        }
    }


    /*

Other Problem on this pattern
🔁 Multi-phase traversal	Traverse tree and apply different operations in each phase (e.g., collect, transform, print).
🧩 Expression tree evaluation	Use state tagging to evaluate postfix/infix expressions stored in a binary tree.
🧠 Morris traversal with tagging	Combine threaded traversal with state tags for space optimization.
🔄 Tree transformation	Convert BST to doubly linked list using in-order traversal with tagging.
🔍 Cycle detection in DAG-like trees	Use VISITING and VISITED states to detect cycles in tree-like graphs.
🧵 Threaded binary tree construction	Use UNPROCESSED, THREADING, and THREADED states to build threaded trees.


     */

}
