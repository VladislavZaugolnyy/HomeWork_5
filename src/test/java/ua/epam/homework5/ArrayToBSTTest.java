package ua.epam.homework5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayToBSTTest {
    @Test
    public void compareInputWithOutputArray() {
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
        arrayToBST.convertArrayToTreeSet(numbers);
        assertEquals(numbers.toString(), arrayToBST.convertArrayToTreeSet(numbers).toString());
    }
}
