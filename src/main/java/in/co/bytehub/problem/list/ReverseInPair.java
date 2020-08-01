package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

public class ReverseInPair {

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
        list.addItemFromEnd("Item10");
        list.addItemFromEnd("Item11");

        list.display();

        list.setHead(reverseInPairs(list.getHead()));
        list.display();
    }

    private static <K> Node<K> reverseInPairs(Node<K> head){
        Node<K> pointer = head;
        // swap first to elements
        if(pointer!= null && pointer.getNext()!=null){
            Node<K> firstNode = pointer;
            Node<K> secondNode = pointer.getNext();
            head = secondNode;
            firstNode.setNext(secondNode.getNext());
            secondNode.setNext(firstNode);
        }


        while (pointer != null && pointer.getNext() !=null && pointer.getNext().getNext()!=null){
            Node<K> next = pointer.getNext();
            Node<K> nextToNext = next.getNext();

            pointer.setNext(nextToNext);
            next.setNext(nextToNext.getNext());
            nextToNext.setNext(next);
            pointer = pointer.getNext().getNext();
        }
        return head;
    }
}
