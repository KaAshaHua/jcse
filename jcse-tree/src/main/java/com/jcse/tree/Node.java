package com.jcse.tree;

import java.util.Objects;

public class Node {
    /*
        IDs, includes:
        - NODE_ID: id of node, default by null, meaning it isn't existed
        - TREE_ID: id of tree, default by null, meaning it isn't contained any trees
        - NODE_PARENT_ID: id of parent, default by null, meaning it hasn't parent
        All of them will determinate a node
    */
    private final int NODE_ID;
    private final int TREE_ID;
    private final int NODE_PARENT_ID;

    public Node(int id, int tree, int parent) {
        this.NODE_ID = Math.abs(id);
        this.TREE_ID = Math.abs(tree);
        this.NODE_PARENT_ID = Math.abs(parent);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(this.getNodeID(), this.getTreeID(), this.getParentID());
    }

    @Override 
    public boolean equals(Object o) {
        if (!(o instanceof Node)) return false;

        Node otherNode = (Node) o;

        boolean c1 = (this.NODE_ID == otherNode.getNodeID());
        boolean c2 = (this.TREE_ID == otherNode.getTreeID());
        boolean c3 = (this.NODE_PARENT_ID == otherNode.getParentID());

        return (c1 && c2 && c3);
    }

    public final int getNodeID() { return this.NODE_ID; }

    public final int getTreeID() { return this.TREE_ID; }

    public final int getParentID() { return this.NODE_PARENT_ID; }
}
