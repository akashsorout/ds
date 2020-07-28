package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

public class FindMiddlePointOfList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.addItemFromEnd("Item1");
        list.addItemFromEnd("Item2");
        list.addItemFromEnd("Item3");
        list.addItemFromEnd("Item4");
        list.addItemFromEnd("Item5");

        Node<String> middleNode = findMiddle(list.getHead());
        System.out.println("middleNode = " + middleNode);
    }

    private static Node<String> findMiddle(Node<String> head) {
        Node<String> pointer1x = head;
        Node<String> pointer2x = head;

        while (pointer2x!=null && pointer2x.getNext()!=null && pointer2x.getNext().getNext()!=null){
            pointer1x = pointer1x.getNext();
            pointer2x = pointer2x.getNext().getNext();
        }
        return pointer1x;
    }
}
