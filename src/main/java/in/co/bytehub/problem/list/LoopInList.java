package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

public class LoopInList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addItemFromEnd("Item1");
        list.addItemFromEnd("Item2");
        list.addItemFromEnd("Item3");
        list.addItemFromEnd("Item4");
        list.addItemFromEnd("Item5");
        list.addItemFromEnd("Item6");
        list.addItemFromEnd("Item7");
        list.addItemFromEnd("Item8");
        list.addItemFromEnd("Item9");

        list.display();

        Node<String> head = list.getHead();
        // Making a loop at Item3

        Node<String> loopNode = head.getNext().getNext();
        Node<String> pointer = head;

        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }

        pointer.setNext(loopNode);

        boolean loopExist = isLoopExist(list.getHead());
        System.out.println("loopExist = " + loopExist);

        Node<String> loopPoint = getLoopPoint(head);
        System.out.println("loopPoint = " + loopPoint.getItem());

        removeLoop(head);
        list.display();
    }

    private static boolean isLoopExist(Node<String> head) {

        // floyd's algorithm

        Node<String> slowPointer = head;
        Node<String> fastPointer = head;

        while (fastPointer != null && fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
            if (slowPointer == fastPointer)
                return true;
        }

        return false;
    }

    private static Node<String> getLoopPoint(Node<String> head) {
        Node<String> loopingPoint = null;
        Node<String> fastPointer = head;
        Node<String> slowPointer = head;
        boolean isLoopPresent = false;
        while (fastPointer != null && fastPointer.getNext() != null) {
            fastPointer = fastPointer.getNext().getNext();
            slowPointer = slowPointer.getNext();
            if (slowPointer == fastPointer) {
                isLoopPresent = true;
                break;
            }
        }
        if (isLoopPresent) {
            slowPointer = head;
            while (slowPointer != fastPointer) {
                slowPointer = slowPointer.getNext();
                fastPointer = fastPointer.getNext();
            }
            loopingPoint = slowPointer;  // either one of slowPointer | fastPointer
        }

        return loopingPoint;
    }

    private static void removeLoop(Node<String> head) {
        Node<String> fastPointer = head;
        Node<String> slowPointer = head;

        boolean isLoopPresent = false;

        while (fastPointer != null && fastPointer.getNext() != null) {
            fastPointer = fastPointer.getNext().getNext();
            slowPointer = slowPointer.getNext();
            if (slowPointer == fastPointer) {
                isLoopPresent = true;
                break;
            }
        }
        if(isLoopPresent){
            slowPointer = head;  // either of slowPointer | fastPointer
            while (slowPointer != fastPointer){
                slowPointer = slowPointer.getNext();
                fastPointer = fastPointer.getNext();
            }

            // Compute Length of LOOP
            int lengthOfLoop = 1;
            fastPointer = fastPointer.getNext(); // Can use either of slowPointer | fastPointer

            while (slowPointer != fastPointer){
                fastPointer = fastPointer.getNext();  // same must be used as on line 110
                ++ lengthOfLoop;
            }
            System.out.println("lengthOfLoop = " + lengthOfLoop);
            for (int i = 1; i < lengthOfLoop; i++) {
                slowPointer = slowPointer.getNext();
            }
            slowPointer.setNext(null); // finally removing loop
        }
    }
}
