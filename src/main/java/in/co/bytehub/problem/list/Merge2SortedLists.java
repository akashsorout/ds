package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

public class Merge2SortedLists {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addItemFromStart(10);
        list1.addItemFromStart(8);
        list1.addItemFromStart(5);
        list1.addItemFromStart(4);
        list1.addItemFromStart(2);
        list1.addItemFromStart(1);

        list1.display();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addItemFromStart(9);
        list2.addItemFromStart(7);
        list2.addItemFromStart(5);
        list2.addItemFromStart(3);

        list2.display();

        LinkedList<Integer> sortedMergedLists = merge2SortedListsInEfficientSolution(list1.getHead(), list2.getHead());
        sortedMergedLists.display();

        LinkedList<Integer> sortedListEfficientSolution = merge2SortedListEfficientSolution(list1.getHead(), list2.getHead());
        sortedListEfficientSolution.display();

    }

    // Inefficient solution
    // addItemFromEnd it self a heavy operation o(n), which will be performed for
    // m + n times  -- o(n^2)
    // O(n) Space complexity
    private static <K extends Comparable> LinkedList<K> merge2SortedListsInEfficientSolution(Node<K> list1, Node<K> list2) {
        LinkedList<K> sortedMergedList = new LinkedList<>();
        Node<K> pointer1 = list1;
        Node<K> pointer2 = list2;

        while (pointer1 != null && pointer2 != null){
            if(pointer1.getItem().compareTo(pointer2.getItem()) < 0) {
                sortedMergedList.addItemFromEnd(pointer1.getItem());
                pointer1 = pointer1.getNext();
            }
            else {
                sortedMergedList.addItemFromEnd(pointer2.getItem());
                pointer2 = pointer2.getNext();
            }
        }
        Node<K> longerListNode = null;
        if( pointer1 == null){
            longerListNode = pointer2;
        }
        else if(pointer2 == null){
            longerListNode = pointer1;
        }
        while (longerListNode != null){
            sortedMergedList.addItemFromEnd(longerListNode.getItem());
            longerListNode = longerListNode.getNext();
        }
        return sortedMergedList;
    }

    private static <K extends Comparable> LinkedList<K> merge2SortedListEfficientSolution(Node<K> list1, Node<K> list2){

        LinkedList<K> mergedSortedList = new LinkedList<>();
        Node<K> mergedListHead = new Node<>();
        Node<K> mergedListPointer = mergedListHead;
        Node<K> pointer1 = list1;
        Node<K> pointer2 = list2;
          while (pointer1 != null && pointer2 != null){
              if(pointer1.getItem().compareTo(pointer2.getItem()) < 0){
                 mergedListPointer.setNext(pointer1);
                  pointer1 = pointer1.getNext();
              }
              else {
                  mergedListPointer.setNext(pointer2);
                  pointer2 = pointer2.getNext();
              }
              mergedListPointer = mergedListPointer.getNext();
          }
          if(pointer1 == null){
              mergedListPointer.setNext(pointer2);
          }
          if (pointer2 == null){
              mergedListPointer.setNext(pointer1);
          }

        mergedSortedList.setHead(mergedListHead.getNext());
        return mergedSortedList;
    }
}
