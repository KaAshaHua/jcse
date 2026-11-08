package com.jcse.tree;

import java.util.ArrayList;
import com.jcse.exception.tree.*;

public class NaryTree extends Tree {
    private final int N;
    private final ArrayList<Node> nodes;

    public NaryTree(int id) {
        this(id, 1000);
    }

    public NaryTree(int id, int n) {
        super(id);
        this.N = n;
        this.nodes = new ArrayList<>(this.maxSize());
        this.nodes.addLast(this.getRoot());
    }

    @Override 
    public int contains(int id, int parent) {
        return this.contains(new Node(id, this.getTreeID(), parent));
    }

    @Override 
    public int contains(Node node) {
        int l = 0, r = this.size() - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (this.nodes.get(m).equals(node)) return m;

            if (this.nodes.get(m).getNodeID() > node.getNodeID()) r = m - 1;
            else l = m + 1;
        }

        return -1;
    }

    @Override 
    public boolean isEmpty() { return this.nodes.isEmpty(); }

    @Override 
    public Node get(int id, int parent) {
        return this.get(new Node(id, this.getTreeID(), parent));
    }

    @Override 
    public Node get(Node node) {
        if (node == null) return null;
        if (this.contains(node) == -1)
            throw new NodeNotFoundException("Node [" + node.getNodeID() + "] is not existed in the tree");
        return this.nodes.get(node.getNodeID());
    }

    @Override 
    public void add(Node node) {
        if (this.contains(node) != -1)
            throw new DuplicateNodeException("Node [" + node.getNodeID() + "] is existed in the tree");
        if (this.size() >= this.maxSize())
            throw new ChildLimitExceededException("Cannot add any nodes because the tree was full, begin Node [" + node.getNodeID() + "]");
        this.nodes.addLast(node);
    }

    @Override 
    public void insert(Node[] nodes) {
        for (Node node : nodes)
            this.add(node);
    }

    @Override 
    public void remove(int id, int parent) {
        this.remove(new Node(id, this.getTreeID(), parent));
    }

    @Override 
    public void remove(Node node) {
        if (this.contains(node) == -1)
            throw new NodeNotFoundException("Node [" + node.getNodeID() + "] is not existed in the tree");
        this.nodes.remove(node);
    }

    @Override 
    public void delete(Node[] nodes) {
        for (Node node : nodes)
            this.remove(node);
    }

    public final int size() { return this.nodes.size(); }

    public final int maxSize() { return this.N; }
}
