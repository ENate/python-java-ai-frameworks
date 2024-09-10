package com.minejava.tutorials;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.minejava.tutorials.btree.BinaryTree;


public class CoreJavaApplicationTests {

    @Test
    public void checkBinaryTreeIfGivenElements_BeingAddedToTree_AreContainedInTree() {
        BinaryTree binaryTree = createBinaryTree();
        assertTrue(binaryTree.checkContainsNode(6));
        assertTrue(binaryTree.checkContainsNode(3));
    }

    BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

}
