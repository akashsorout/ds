package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

public class NthFromEnd {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addItemFromEnd("Item1");
        list.addItemFromEnd("Item2");
        list.addItemFromEnd("Item3");
        list.addItemFromEnd("Item4");
        list.addItemFromEnd("Item5");
        list.addItemFromEnd("Item6");

        list.display();

        // Get the 4th Item from End i.e.  Item3

        Node<String> head = list.getHead();

        Node<String> nthNodeFromEnd = getNthNodeFromEndViaNumberSystemSol(head, 4);
        System.out.println("nthNodeFromEnd.getItem() = " + nthNodeFromEnd.getItem());

        Node<String> nthNodeFromEndEfficiently = getNthNodeFromEndEfficiently(head, 4);
        System.out.println("nthNodeFromEndEfficiently = " + nthNodeFromEndEfficiently.getItem());
    }

    private static Node<String> getNthNodeFromEndViaNumberSystemSol(Node<String> head, int fromEnd) {
        /* *
         * Algo
         * Calculate Length of list
         * covert fromEnd position to fromStart position using:
         *      -  position of 'B' in A-Z from start is 2  say i
         *      -  position of 'B' in A-Z from end is 25   say k
         *
         *      i+k = 26 + 1   [ size + 1 ]
         *
         * If we have location of a node fromEnd we can calculate it's value fromStart
         * Time Complexity: O(2n) // n to get length , n to fetch the item
         *                : O(n)
         * */

        Node<String> pointer = head; int length = 0;
        while (pointer!=null){
            pointer = pointer.getNext();
            ++length;
        }

        int fromStart = length + 1 - fromEnd;
        pointer = head;
        for(int i = 1; i < fromStart; ++i){
            pointer = pointer.getNext();
        }
        return pointer;
    }

    private static Node<String> getNthNodeFromEndEfficiently(Node<String> head, int n){
        /**
         *  - have 2 pointers: traversingPointer, resultPointer = head
         *  - move traversingPointer n times in f/w direction
         *  - now, both the pointer will have distance of n items
         *  - maintain the distance and pull the traversing node to end of list with resultPointer
         *  - resultPointer will be at desired node
         * */

        Node<String> traversingPointer = head;
        Node<String> resultPointer = head;

        for (int i = 1; i < n ; i++) {
            traversingPointer = traversingPointer.getNext();
        }

        while (traversingPointer.getNext() != null){
            traversingPointer = traversingPointer.getNext();
            resultPointer = resultPointer.getNext();
        }
        return resultPointer;
    }
}
