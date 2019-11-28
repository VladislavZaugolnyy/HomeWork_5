package ua.epam.homework5.rotateLinkedList;

import java.util.Collections;
import java.util.LinkedList;

class RotateLinkedList {
    LinkedList rotateLinkedList(LinkedList<Integer> linkedList, int k) {
        System.out.println("Initial linked list:");
        System.out.println(linkedList);
        Collections.rotate(linkedList, k);
        System.out.println("Rotated linked list:");
        System.out.println(linkedList);
        return linkedList;
    }
}
