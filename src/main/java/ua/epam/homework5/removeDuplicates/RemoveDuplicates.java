package ua.epam.homework5.removeDuplicates;

class RemoveDuplicates {
    int removeDuplicatesFromArray(int[] array) {
        if (array.length < 2) {
            return array.length;
        } else {
            int j = 0;
            int i = 1;

            while (i < array.length) {
                if (array[i] != array[j]) {
                    j++;
                    array[j] = array[i];
                }
                i++;
            }
            return j + 1;
        }
    }
}
