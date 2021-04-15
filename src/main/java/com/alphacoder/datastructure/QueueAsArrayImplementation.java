package com.alphacoder.datastructure;

public class QueueAsArrayImplementation {
    private static final int INIT_CAPACITY= 10;
    private static int CURRENT_CAPACITY;
    private int[] arr;
    private int head;

    public QueueAsArrayImplementation(){
        this.arr= new int[INIT_CAPACITY];
        CURRENT_CAPACITY= INIT_CAPACITY;
        this.head= -1;
    }

    public boolean isEmpty(){
        return (this.head==-1);
    }

    public int head(){
        if(this.isEmpty()){
            throw new UnsupportedOperationException("Queue is empty.");
        }
        return this.arr[head];
    }
}
