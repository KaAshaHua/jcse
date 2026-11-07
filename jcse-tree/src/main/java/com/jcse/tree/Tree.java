package com.jcse.tree;

public abstract class Tree {
    private final int TREE_ID;      // ID of tree
    protected int counter = 1;      // <- Using for creating ID Node, default by 1

    protected Node root;            // <- Root of tree, ID is 0

    public Tree(int id) {
        this.TREE_ID = id;
        this.root = new Node(0, id, -1);
    }

    public final int getTreeID() { return  this.TREE_ID; }

    public final Node getRoot() { return this.root; }

    public final boolean equals(Tree tree) { return this.TREE_ID == tree.getTreeID(); }

    public abstract Node getNode(Node node);

    public abstract boolean isEmpty();

    public abstract void insertNode(Node node);

    public abstract void deleteNode(Node node);
}
