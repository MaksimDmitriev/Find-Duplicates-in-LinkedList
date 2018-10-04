package com.app;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public void removeDuplicates(LinkedList linkedList) {
        Set<Integer> buffer = new HashSet<>();
        Node node = linkedList.head.next;
        while (node != null) {
            if (buffer.contains(node.val)) {
                node.prev.next = node.next;
                if (node.next != null) {
                    node.next.prev = node.prev;
                }
            } else {
                buffer.add(node.val);
            }
            node = node.next;
        }
    }

    public static class LinkedList {

        private Node head = new Node(0); // dummy node
        private Node tail = head; // not a dummy node

        void append(int val) {
            Node node = new Node(val);
            tail.next = node;
            node.prev = tail;
            tail = tail.next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof LinkedList)) {
                return false;
            }
            LinkedList other = (LinkedList) o;
            Node node = head.next;
            Node otherNode = other.head.next;
            while (node != null && otherNode != null) {
                if (node.val == otherNode.val) {
                    node = node.next;
                    otherNode = otherNode.next;
                } else {
                    return false;
                }
            }
            return node == null && otherNode == null;
        }

        @Override
        public int hashCode() {
            int res = 17;
            Node node = head.next;
            while (node != null) {
                res = 31 * res + node.val;
                node = node.next;
            }
            return res;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            Node node = head.next;
            while (node != null) {
                builder.append(node.val);
                if (node.next != null) {
                    builder.append(" > ");
                }
                node = node.next;
            }
            builder.append("]");
            return builder.toString();
        }
    }

    public static class Node {

        Node prev;
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }

    }
}
