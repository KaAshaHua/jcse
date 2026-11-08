package com.jcse.tree;

public abstract class Tree {
    private final int TREE_ID;      // ID of tree
    private final Node root;        // Root of tree, ID is 0

    public Tree(int id) {
        this.TREE_ID = Math.abs(id);
        this.root = new Node(0, this.TREE_ID, -1);
    }

    @Override 
    public boolean equals(Object o) {
        if (!(o instanceof Tree)) return false;

        Tree otherTree = (Tree) o;

        return this.getTreeID() == otherTree.getTreeID();
    }

    @Override 
    public int hashCode() {
        return Integer.hashCode(this.getTreeID());
    }

    public final int getTreeID() { return this.TREE_ID; }

    public final Node getRoot() { return this.root; }

    public abstract int contains(int id, int parent);

    public abstract int contains(Node node);

    public abstract boolean isEmpty();

    public abstract Node get(int id, int parent);

    public abstract Node get(Node node);

    public abstract void add(Node node);

    public abstract void insert(Node[] nodes);

    public abstract void remove(Node node);

    public abstract void remove(int id, int parent);

    public abstract void delete(Node[] nodes);
}
