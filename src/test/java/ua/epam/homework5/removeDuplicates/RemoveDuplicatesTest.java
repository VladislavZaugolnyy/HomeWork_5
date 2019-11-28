package ua.epam.homework5.removeDuplicates;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    private RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void shouldReturnNewLength() {
        int[] initialArray = {1, 1, 2};
        int expectedNewLength = 2;

        assertEquals(expectedNewLength, removeDuplicates.removeDuplicatesFromArray(initialArray));
    }

    @Test
    public void shouldReturnNewLength2() {
        int[] initialArray = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int expectedNewLength = 5;

        assertEquals(expectedNewLength, removeDuplicates.removeDuplicatesFromArray(initialArray));
    }

    @Test
    public void shouldReturn0() {
        int[] initialArray = {};
        int expectedNewLength = 0;

        assertEquals(expectedNewLength, removeDuplicates.removeDuplicatesFromArray(initialArray));
    }
}
