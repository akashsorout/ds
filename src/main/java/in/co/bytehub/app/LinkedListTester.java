package in.co.bytehub.app;

import in.co.bytehub.ds.list.LinkedList;

public class LinkedListTester {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.addItemFromStart("Item1");
        linkedList.addItemFromStart("Item2");
        linkedList.addItemFromStart("Item3");
        linkedList.addItemFromStart("Item4");

        linkedList.display();

        linkedList.addItemFromEnd("FirstFromEnd");
        linkedList.display();

        linkedList.addItemAtPosition("FirstFromPosition", 14);
        linkedList.display();

        System.out.println("linkedList.deleteFromStart() = " + linkedList.deleteFromStart());
        linkedList.display();

        System.out.println("linkedList.deleteFromEnd() = " + linkedList.deleteFromEnd());
        linkedList.display();

        System.out.println("linkedList.deleteFromPosition(2) = " + linkedList.deleteFromPosition(12));
        linkedList.display();

    }
}
