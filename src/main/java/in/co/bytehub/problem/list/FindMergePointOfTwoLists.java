package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

import java.util.HashSet;

public class FindMergePointOfTwoLists {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<String>();
        list1.addItemFromEnd("Item1");
        list1.addItemFromEnd("Item2");
        list1.addItemFromEnd("Item3");
        list1.addItemFromEnd("Item4");
        list1.addItemFromEnd("Item5");
        list1.addItemFromEnd("Item6");
        list1.addItemFromEnd("Item7");

        LinkedList<String> list2 = new LinkedList<String>();
        list2.addItemFromEnd("Item21");
        list2.addItemFromEnd("Item22");

        // Merging 2 list at a point
        // Item5 in list1
        // Which is next of Item22 in list2

        list2.getHead()
                .getNext().setNext(
                list1.getHead()
                        .getNext()
                        .getNext()
                        .getNext()
                        .getNext()
        );

        list1.display();
        list2.display();
        Node<String> mergePointOfLists = findMergePointOfLists(list1.getHead(), list2.getHead());
        System.out.println("mergePointOfLists = " + mergePointOfLists.getItem());

        Node<String> mergePointOfLists2 = findMergePointOfListsUsingHashSet(list1.getHead(), list2.getHead());
        System.out.println("mergePointOfListUsingHashSet = " + mergePointOfLists2.getItem());
    }

    private static Node<String> findMergePointOfLists(Node<String> list1Head, Node<String> list2Head) {
        int lis11length = 0, lis12length = 0;

        Node<String> pointer = list1Head;
        while (pointer != null) {
            ++lis11length;
            pointer = pointer.getNext();
        }

        pointer = list2Head;
        while (pointer != null) {
            ++lis12length;
            pointer = pointer.getNext();
        }
        int difference = 0;
        Node<String> longerListPointer = null;
        Node<String> shorterListPointer = null;

        if (lis11length > lis12length) {
            difference = lis11length - lis12length;
            longerListPointer = list1Head;
            shorterListPointer = list2Head;
        } else {
            difference = lis12length - lis11length;
            longerListPointer = list2Head;
            shorterListPointer = list1Head;
        }

        for (int i = 0; i < difference; i++) {
            longerListPointer = longerListPointer.getNext();
        }

        while (shorterListPointer != longerListPointer) {
            shorterListPointer = shorterListPointer.getNext();
            longerListPointer = longerListPointer.getNext();
        }

        return shorterListPointer;
    }

    private static Node<String> findMergePointOfListsUsingHashSet(Node<String> list1Head, Node<String> list2Head) {

        HashSet<Node<String>> list1Nodes = new HashSet<>();
        Node<String> pointer = list1Head;
        while (pointer != null){
            list1Nodes.add(pointer);
            pointer = pointer.getNext();
        }
        pointer = list2Head;
        while (!list1Nodes.contains(pointer) && pointer != null){
            pointer = pointer.getNext();
        }
        return pointer;
    }
}
