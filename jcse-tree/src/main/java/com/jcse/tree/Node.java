package com.jcse.tree;

public class Node {
    /*
        IDs, includes:
        - NODE_ID: id of node, default by null, meaning it isn't existed
        - TREE_ID: id of tree, default by null, meaning it isn't contained any trees
        - NODE_PARENT_ID: id of parent, default by null, meaning it hasn't parent
    */
    private final int NODE_ID;
    private final int TREE_ID;
    private final int NODE_PARENT_ID;

    public Node(int id, int tree, int parent) {
        this.NODE_ID = id;
        this.TREE_ID = tree;
        this.NODE_PARENT_ID = parent;
    }

    public final int getNodeID() { return this.NODE_ID; }

    public final int getTreeID() { return this.TREE_ID; }

    public final int getParentID() { return this.NODE_PARENT_ID; }

    public final boolean equals(Node node) {
        boolean c1 = (this.NODE_ID == node.getNodeID());            // Condition 1
        boolean c2 = (this.TREE_ID == node.getTreeID());            // Condition 2
        boolean c3 = (this.NODE_PARENT_ID == node.getParentID());   // Condition 3

        return (c1 && c2 && c3);
    }
}
