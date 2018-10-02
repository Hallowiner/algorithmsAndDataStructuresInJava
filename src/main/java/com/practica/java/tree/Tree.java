package com.practica.java.tree;

import java.util.HashMap;

public class Tree {

    private Nodo root;

    public Nodo find(int key) {
        Nodo current = root;
        while (current != null && current.getData() != key) {
            if (key < current.getData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        return current;

    }

    public void insert(int value) {
        Nodo nodo = new Nodo(value);

        if (root == null) {
            root = nodo;
            return;
        }
        Nodo current = root;
        Nodo parent;
        while (true) {
            parent = current;
            if (value < parent.getData()) {
                current = current.getLeftChild();
                if (current == null) {
                    parent.setLeftChild(nodo);
                    return;
                }
            } else {
                current = current.getRightChild();
                if (current == null) {
                    parent.setRightChild(nodo);
                    return;
                }
            }
        }
    }

    public void inOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        //1-
        inOrder(nodo.getLeftChild());
        //2- VISITA:
        System.out.println(nodo.getData());
        //3-
        inOrder(nodo.getRightChild());
    }

    public int minimun() {
        Nodo current = root;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current.getData();
    }

    public int maximun() {
        Nodo current = root;
        while (current.getRightChild() != null) {
            current = current.getRightChild();
        }
        return current.getData();
    }

    public void remove(int value) {
        Nodo current = root;
        Nodo parent = root;
        boolean isLeftChild = true;

        while (current.getData() != value) {
            parent = current;
            if (value < current.getData()) {
                isLeftChild = true;
                current = current.getLeftChild();
            } else {
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null) {
                return;
            }
        }
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            //leaf
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
        } else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }

        } else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else {
            Nodo successor = getSuccessor(current);
            if(current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }
    }

    private Nodo getSuccessor(Nodo n) {
        Nodo successorParent = n;
        Nodo successor = n;
        Nodo current = n.getRightChild();

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != n.getRightChild()) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(n.getRightChild());
        }
        return successor;
    }

    public Nodo getRoot() {
        return root;
    }
}
