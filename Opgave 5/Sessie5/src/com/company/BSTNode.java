/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/

/** Binary tree node implementation: Pointers to children
    @param E The data element
    @param Key The associated key for the record */
class BSTNode<Key, E> implements BinNode<E> {
  private Key key;              // Key for this node
  private E element;            // Element for this node
  private BSTNode<Key,E> left;  // Pointer to left child
  private BSTNode<Key,E> right; // Pointer to right child

  /** Constructors */
  public BSTNode() {left = right = null; }
  public BSTNode(Key k, E val)
  { left = right = null; key = k; element = val; }
  public BSTNode(Key k, E val,
                 BSTNode<Key,E> l, BSTNode<Key,E> r)
  { left = l; right = r; key = k; element = val; }

  /** Get and set the key value */
  public Key key() { return key; }
  public void setKey(Key k) { key = k; }

  /** Get and set the element value */
  public E element() { return element; }
  public void setElement(E v) { element = v; }


  /** Get and set the left child */
  public BSTNode<Key,E> left() { return left; }
  public void setLeft(BSTNode<Key,E> p) { left = p; }

  /** Get and set the right child */
  public BSTNode<Key,E> right() { return right; }
  public void setRight(BSTNode<Key,E> p) { right = p; }

  /** @return True if a leaf node, false otherwise */
  public boolean isLeaf()
  { return (left == null) && (right == null); }

  public void preorder(BinNode trav) {
    if(trav == null) return;
    System.out.print(trav.element()+" ");
    preorder(trav.left());
    preorder(trav.right());

  }

  public void inorder(BinNode trav) {
    if(trav == null) return;
    inorder(trav.left());
    System.out.print(trav.element()+" ");
    inorder(trav.right());

  }

  public void postorder(BinNode trav) {
    if(trav == null) return;
    postorder(trav.left());
    postorder(trav.right());
    System.out.print(trav.element()+" ");

  }


  public void insert(Key key, E value)
  {
    if(key instanceof Integer)
    {
      if((int)key < (int)this.key)
      {
        if(this.left == null)
          this.setLeft(new BSTNode<>(key,value));
        else
        {
          this.left.insert(key,value);
        }
      }
      else
      {
        if(this.right == null)
          this.setRight(new BSTNode<>(key,value));
        else
          this.right.insert(key,value);
      }
    }
  }

  public int hoogte()
  {
    int  hoogteLinks= 0;
    int  hoogteRechts = 0;

    if(this.left !=null)
      hoogteLinks =this.left.hoogte();

    if(this.right != null)
      hoogteRechts = this.right.hoogte();

    if(hoogteRechts > hoogteLinks)
      return hoogteRechts + 1;
    else
      return hoogteLinks + 1;
  }

 }


