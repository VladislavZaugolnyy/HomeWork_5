package ua.epam.homework5;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class PartitionLinkedListTest {
    private PartitionLinkedList partitionLinkedList = new PartitionLinkedList();

    @Test
    public void partitionTest1() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);

        LinkedList<Integer> linkedListExpected = new LinkedList<Integer>();
        linkedListExpected.add(1);
        linkedListExpected.add(1);
        linkedListExpected.add(2);
        linkedListExpected.add(2);
        linkedListExpected.add(3);
        linkedListExpected.add(3);
        linkedListExpected.add(4);
        linkedListExpected.add(5);
        linkedListExpected.add(4);

        int delimiterValue = 4;

        assertEquals(linkedListExpected, partitionLinkedList.partitionLinkedList(linkedList, delimiterValue));
    }

    @Test
    public void partitionTest2() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(2);

        LinkedList<Integer> linkedListExpected = new LinkedList<Integer>();
        linkedListExpected.add(1);
        linkedListExpected.add(2);
        linkedListExpected.add(2);
        linkedListExpected.add(4);
        linkedListExpected.add(3);
        linkedListExpected.add(5);

        int delimiterValue = 3;

        assertEquals(linkedListExpected, partitionLinkedList.partitionLinkedList(linkedList, delimiterValue));
    }


}
