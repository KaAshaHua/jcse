package com.jcse.tree;

import org.junit.jupiter.api.Test;

import com.jces.util.Trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTree {

    @Test
    void Test() {
        int N = 10;
        NaryTree naryTree = new NaryTree(0, N);

        System.out.println("Max size: " + naryTree.maxSize());

        System.out.println("Root of tree: " + naryTree.getRoot().getNodeID() + ", current size: " + naryTree.size());

        for (int i = 1; i < N; i++) {
            Node node = new Node(
                Trees.generateNodeID(),
                naryTree.getTreeID(),
                -1
            );

            naryTree.add(node);
            System.out.println("Node [" + node.getNodeID() + "] is created, current size: " + naryTree.size());
        }

        naryTree.remove(9, -1);
        System.out.println(naryTree.size());

        for (int i = 0; i < N; i++) {
            System.out.println("Node [" + naryTree.get(i, -1).getNodeID() + "]");
        }
    }
}