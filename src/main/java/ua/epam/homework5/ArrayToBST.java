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
}

