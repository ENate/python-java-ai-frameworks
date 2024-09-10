package com.minejava.tutorials.btree;

/**
 * A class to construct our binary tree.
 */
public class BinaryTree {
    Node root;

    /**
     * Insertion of new elements by adding
     * a new node in order to keep the tree sorted with the following rules:
     * <ul>
     *     <li> if the value of the new node is lower than that of the current node, go to the left child
     *     <li> if the value of the new node is greater than that of the current node, go to the right child
     *     <li> if the current node is null, we reached a leaf node and can insert a new node at that position
     * </ul>
     * @param current represents current Node to be added to tree
     * @param value represents the value to be added
     * @return
     */
    private Node addRecursive(Node current, int value) {
        // Check if current Node is null
        if (current == null) {
            return new Node(value);
        }
        // If not new, check where to insert value
        if (value < current.value) {
            // Insert value to left Node
            current.left = addRecursive(current.left, value);
        } else if ( value > current.value) {
            // Insert value to the Right Node
            current.right = addRecursive(current.right, value);
        } else {
            // Just return the current Node or do nothing.
            return current;
        }
        return current;


    }

    /**
     * Helps to kick start recursion
     * @param value
     */
    public void add(int value) {
        root = addRecursive(root, value);
    }

    /*
     * Creates Binary tree and insert elements.
     */
    private BinaryTree createBinaryTree() {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(9);
        return binaryTree;
    }

    /**
     * Checks current node recusively
     * @param currentNode represents a particular Node
     * @param value represents a particular value
     * @return
     */
    private boolean checkNodeRecursively(Node currentNode, int value) {
        // Check if null
        if (currentNode == null) {
            return false;
        }

        //  Not null node
        if (value == currentNode.value) {
            return true;
        }

        // Specify the nNode to return search value from
        return value < currentNode.value
        ? checkNodeRecursively(currentNode.left, value)
        : checkNodeRecursively(currentNode.right, value);
    }

    /**
     * Perform search for the value by comparing the given value
     *  to the value in the current node
     * @param value
     * @return
     */
    public boolean checkContainsNode(int value) {
        return checkNodeRecursively(root, value);
    }

}
