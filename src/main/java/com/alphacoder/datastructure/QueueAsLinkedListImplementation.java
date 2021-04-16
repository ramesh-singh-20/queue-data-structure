package com.alphacoder.datastructure;

public class QueueAsLinkedListImplementation {
    private Node front;
    private Node rear;
    private Node temp;

    public boolean isEmpty(){
        return (front== null && rear== null);
    }

    public int front(){
        if(this.isEmpty()){
            throw new UnsupportedOperationException("Queue is empty.");
        }
        return this.front.getData();
    }

    public void enQueue(int data){
        Node node= new Node();
        node.setData(data);
        this.temp= node;
        if(isEmpty()){
            this.front= this.rear= this.temp;
            return;
        }
        this.rear.setNext(node);
        this.rear= this.temp;

    }


    public void deQueue(){
        if(this.isEmpty()){
            throw new UnsupportedOperationException();
        }
        if(rear==front){
            rear= null;
        }
        Node temp= this.front;
        this.front= this.front.getNext();
        temp.setNext(null);

    }
}
