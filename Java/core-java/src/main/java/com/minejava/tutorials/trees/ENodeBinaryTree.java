package com.minejava.tutorials.trees;

public class ENodeBinaryTree {

    ENode eNode;

    private ENode buildCurrentNode(ENode enode, int myValue) {

        // Check if current ENode is null
        if (enode == null) {
            return new ENode(myValue);
        }

        // Consider other cases
        if (myValue < enode.value) {
            enode.leftNode = buildCurrentNode(enode.leftNode, myValue);
        } else if (myValue > enode.value) {
            enode.rightNode = buildCurrentNode(enode.rightNode, myValue);
        } else {
            return enode;
        }
        return enode;
    }

    // To start recursive builds
    public void add(int vals) {
        eNode = buildCurrentNode(eNode, vals);
    }

    // Check nodes recursively and return boolean in all cases
    private boolean containsNode(ENode current, int value) {
        // Check root
        if (current == null) {
            return false;
        }

        // Consider other cases for nodes
        if (value == current.value) {
            return true;
        }

        // Remaining cases
        return value < current.value
        ? containsNode(current.leftNode, value)
        : containsNode(current.rightNode, value);
    }

    // Define method to publicly call method
    public boolean recursiveMethodCaller(int value) {
        return containsNode(eNode, value);
    }

}
