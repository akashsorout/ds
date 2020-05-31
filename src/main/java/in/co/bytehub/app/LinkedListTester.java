package in.co.bytehub.app;

import in.co.bytehub.ds.list.LinkedList;

public class LinkedListTester {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.addItemFromStart("FIRST");

        linkedList.display();

        linkedList.addItemFromEnd("FirstFromEnd");
        linkedList.display();

        System.out.println("linkedList.deleteFromStart() = " + linkedList.deleteFromStart());
        linkedList.display();

        System.out.println("linkedList.deleteFromEnd() = " + linkedList.deleteFromEnd());
        linkedList.display();

    }
}
