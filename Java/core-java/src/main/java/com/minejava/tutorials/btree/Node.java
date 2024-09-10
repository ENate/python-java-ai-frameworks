package com.minejava.tutorials.btree;

public class Node {
    // Recursive algorithm where root notes 
    // are less than left right nodes, but less than left nodes
    int value;
    Node left;
    Node right;
    /**
     * Initialize variables 
     * @param value To be added.
     */
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

}
