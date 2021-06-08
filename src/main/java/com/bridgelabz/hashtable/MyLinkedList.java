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
    public void delete(K key) {
        if (head.key.equals(key)) {
            head = head.next;
        }
        MyMapNode<K, V> temp = head;
        if (tail.key.equals(key)) {
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        } else {
            while (temp.next != null) {
                if (temp.next.key.equals(key)) {
                    MyMapNode<K, V> found = temp.next;
                    temp.next = found.next;
                }
                temp = temp.next;
            }
        }
    }
}

