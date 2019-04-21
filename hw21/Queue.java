package ru.kpfu.itis;

public class Queue<T>{
    private Node head = null;
    private class Node <T>{
        private T value;
        private Node link = null;
        Node(T value){
            this.value = value;
        }
        Node next(){
            return link;
        }
        void setNext(Node link){
            this.link = link;
        }
        T getT(){
            return value;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void enqueue(T value){
        Node t = new Node(value);
        Node current = head;
        if(head == null) head = t;
        else{
            while(current.next() != null)current = current.next();
            current.setNext(t);
        }
    }
    public T dequeue(){
        return this.pop();
    }
    private T pop(){
        T t = (T)head.getT();
        head = head.next();
        return t;
    }
}
