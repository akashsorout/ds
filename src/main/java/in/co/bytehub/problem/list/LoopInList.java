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
     //   list.addItemFromEnd("Item9");

        list.display();

        Node<String> head = list.getHead();
        // Making a loop at Item3

        Node<String> loopNode = head.getNext().getNext();
        Node<String> pointer = head;
        while (pointer.getNext() != null){
            pointer = pointer.getNext();
        }
        pointer.setNext(loopNode);



        boolean loopExist = isLoopExist(list.getHead());
        System.out.println("loopExist = " + loopExist);
    }

    private static boolean isLoopExist(Node<String> head) {

        // floyd's algorithm

        Node<String> slowPointer = head;
        Node<String> fastPointer = head;

        while (fastPointer!= null && fastPointer.getNext() != null){
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
            if(slowPointer == fastPointer)
                return true;
        }

        return false;
    }
}
