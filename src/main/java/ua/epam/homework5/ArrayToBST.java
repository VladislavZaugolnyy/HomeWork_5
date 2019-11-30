package ua.epam.homework5;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayToBST {
    public TreeSet<Integer> convertArrayToTreeSet(ArrayList<Integer> list) {
        if (list == null)
            return new TreeSet();
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(list);
        return treeSet;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        ArrayToBST arrayToBST = new ArrayToBST();
        System.out.println(arrayToBST.convertArrayToTreeSet(numbers));
    }
}

