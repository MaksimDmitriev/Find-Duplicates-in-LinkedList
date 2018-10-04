package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void empty() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        assertEquals(expected, linkedList);
    }

    @Test
    void single() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        expected.append(1);
        assertEquals(expected, linkedList);
    }

    @Test
    void twoUniqueElements() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        expected.append(1);
        expected.append(2);
        assertEquals(expected, linkedList);
    }

    @Test
    void twoDuplicatesElements() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        linkedList.append(1);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        expected.append(1);
        assertEquals(expected, linkedList);
    }

    @Test
    void uniqueBetweenDuplicates() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(1);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        expected.append(1);
        expected.append(2);
        assertEquals(expected, linkedList);
    }

    @Test
    void duplicatesInMiddle() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(4);
        linkedList.append(2);
        linkedList.append(3);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        expected.append(1);
        expected.append(2);
        expected.append(4);
        expected.append(3);
        assertEquals(expected, linkedList);
    }

    @Test
    void duplicatesInMiddleInRow() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(4);
        linkedList.append(3);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        expected.append(1);
        expected.append(2);
        expected.append(4);
        expected.append(3);
        assertEquals(expected, linkedList);
    }

    @Test
    void firstAndLastDuplicates() {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(1);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);

        Solution.LinkedList expected = new Solution.LinkedList();
        expected.append(1);
        expected.append(2);
        expected.append(3);
        expected.append(4);
        assertEquals(expected, linkedList);
    }
}