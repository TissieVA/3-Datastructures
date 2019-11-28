package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        createTree();
        testTree1();
        testTree2();
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
        public static void testTree1()
        {
            System.out.println("");
            BSTNode<Integer,Integer> root = new BSTNode(1,1);
            for (int i = 2; i < 9; i++) {
                root.insert(i,i);
            }
            System.out.println("");
            root.inorder(root);
            System.out.println("\n"+root.hoogte()+"\n");
        }
        public static void testTree2()
        {
            Random random = new Random();
            int a = random.nextInt(20);
            BSTNode<Integer,Integer> root = new BSTNode(a,a);

            for (int i = 1; i < 10; i++) {
                int b= random.nextInt(20);
                root.insert(b,b);
            }

            root.inorder(root);
            System.out.println("");
            System.out.println(root.hoogte());

        }
}


