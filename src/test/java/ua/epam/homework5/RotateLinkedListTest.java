package ua.epam.homework5;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class RotateLinkedListTest {
    private RotateLinkedList rotateLinkedList = new RotateLinkedList();

    @Test
    public void shouldRotateLinkedListByKElements() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        LinkedList<Integer> initialLinkedList = new LinkedList<Integer>();
        initialLinkedList.add(1);
        initialLinkedList.add(2);
        initialLinkedList.add(3);
        initialLinkedList.add(4);
        initialLinkedList.add(5);

        int rotations = 1;
        LinkedList<Integer> rotatedLinkedList = rotateLinkedList.rotateLinkedList(initialLinkedList, rotations);
        assertEquals(linkedList, rotatedLinkedList);
    }

    @Test
    public void shouldRotateLinkedListFullCycle() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        LinkedList<Integer> initialLinkedList = new LinkedList<Integer>();
        initialLinkedList.add(1);
        initialLinkedList.add(2);
        initialLinkedList.add(3);
        initialLinkedList.add(4);
        initialLinkedList.add(5);

        int cycle = initialLinkedList.size();
        LinkedList<Integer> rotatedLinkedList = rotateLinkedList.rotateLinkedList(initialLinkedList, cycle);
        assertEquals(linkedList, rotatedLinkedList);
    }
}
