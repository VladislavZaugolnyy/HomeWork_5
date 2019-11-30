package ua.epam.homework5;

import java.util.LinkedList;

class PartitionLinkedList {
    LinkedList<Integer> partitionLinkedList(LinkedList<Integer> linkedList, int delimiter) {
        int tmpValueHolder;
        if (linkedList == null) {
            return new LinkedList<Integer>();
        } else if (linkedList.size() == 1) {
            return linkedList;
        } else {
            for (int i = linkedList.get(delimiter); i < linkedList.size() - 1; i++) {
                if (linkedList.get(i + 1) < (delimiter)) {
                    tmpValueHolder = linkedList.remove(i + 1);
                    for (int j = 0; j < linkedList.indexOf(delimiter); j++) {
                        if (linkedList.get(j) >= tmpValueHolder) {
                            linkedList.add(j, tmpValueHolder);
                            break;
                        }
                    }
                }
            }
        }
        return linkedList;
    }
}
