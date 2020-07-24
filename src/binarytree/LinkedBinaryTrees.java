/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.Iterator;
import positionexample.Position;

/**
 *
 * @author DOTR
 */
public class LinkBinaryTrees<E> extends AbstractBinaryTree<E> {

  
    protected static abstract class Node<E> implements Position<E>{
      private E element;
      private Node<E> parent;
      private Node<E> right;
      private Node<E> left;
    
   public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild){
   
       element = e;
       parent = above;
       left = leftChild;
       right = rightChild;
   }

   public void setElement(E e){element = e;}
   public void setParent(Node<E> pareNode){parent = pareNode;}
   public void setLeft(Node<E> leftC){ left = leftC;}
   public void setRight(Node<E> rightC){right =rightC;}
   
   public E getElement(){return element;}
   public Node<E> getParent(){ return parent;}
   public Node<E> getLeft(){return left;}
   public Node<E> getRight(){return right;}
    }
   
   protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right){
    return new Node<E>(e, parent, left, right) {};
    } 
   public LinkBinaryTrees(){}
    
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException{
    if (!(p instanceof Node))
        throw new IllegalArgumentException("Not valid position type");
    
    Node<E> node = (Node<E>) p;
   
    if (node.getParent() == node)
    throw new IllegalArgumentException("p is no longer in the tree");
    return node;
    }
    
        @Override
    public Position<E> root() {
        return root();
    }

    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }

    @Override
    public int size() {
        return size();
    }

      @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Position<E>> positions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
         Node<E> node = validate(p);
        return node.getLeft();
    
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
       Node<E> node = validate(p);
        return node.getRight();
    
}
}
