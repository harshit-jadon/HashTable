package com.bridgelabz.hashtable;

public class MyLinkedList <K,V>{
    MyMapNode<K,V> head;
    MyMapNode<K,V> tail;

    MyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void append(MyMapNode<K, V> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail != null) {
            this.tail.setNext(myNode);
        }
        this.tail = myNode;
    }
    public MyMapNode<K, V> search(K key) {
        MyMapNode<K, V> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.next;
        }
        return null;
    }
}

