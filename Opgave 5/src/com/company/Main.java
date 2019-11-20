package com.company;

public class Main {

    public static void main(String[] args) {
        createTree();
    }

    public static void createTree()
    {
        BSTNode<Integer,Integer> root = new BSTNode(40,40);

        BSTNode node1 = new BSTNode(25,25);
        root.setLeft(node1);

        BSTNode node2 = new BSTNode(78,78);
        root.setRight(node2);

        BSTNode node3 = new BSTNode(10,10);
        node1.setLeft(node3);

        BSTNode node4 = new BSTNode(32,32);
        node1.setRight(node4);

        System.out.print("\nPre-order: ");
        root.preorder(root);

        System.out.print("\nIn-order: ");
        root.inorder(root);

        System.out.print("\nPost-order: ");
        root.postorder(root);
    }

}
