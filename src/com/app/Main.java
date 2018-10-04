package com.app;

public class Main {

    public static void main(String[] args) {
        Solution.LinkedList linkedList = new Solution.LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        Solution solution = new Solution();
        solution.removeDuplicates(linkedList);
    }
}
