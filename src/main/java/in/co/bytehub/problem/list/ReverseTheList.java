package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

public class ReverseTheList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.addItemFromEnd("Item1");
        list.addItemFromEnd("Item2");
        list.addItemFromEnd("Item3");
        list.addItemFromEnd("Item4");
        list.addItemFromEnd("Item5");
        list.addItemFromEnd("Item6");

        list.display();
        Node<String> reversedHeadNode = reverseTheList(list.getHead());
        list.setHead(reversedHeadNode);
        list.display();



    }

    private static Node<String> reverseTheList(Node<String> head){

        Node<String> pointer = head;
        Node<String> previous = null;

        while (pointer != null){
            Node<String> next = pointer.getNext();  // To Have next node, because pointer.setNext is going to change the next node
            pointer.setNext(previous);
            previous = pointer;
            pointer = next;
        }
        return previous;
    }
}
