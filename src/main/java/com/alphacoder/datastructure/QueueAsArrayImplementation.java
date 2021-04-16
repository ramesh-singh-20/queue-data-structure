package com.alphacoder.datastructure;

public class QueueAsArrayImplementation {
    private static final int INIT_CAPACITY= 10;
    private static int CURRENT_CAPACITY;
    private int[] arr;
    private int rear;
    private int head;

    public QueueAsArrayImplementation(){
        this.arr= new int[INIT_CAPACITY];
        CURRENT_CAPACITY= INIT_CAPACITY;
        this.rear= -1;
        this.head= -1;
    }

    public boolean isEmpty(){
        return (this.rear== -1 || this.head> this.rear);
    }

    public int head(){
        if(this.isEmpty()){
            throw new UnsupportedOperationException("Queue is empty.");
        }
        return this.arr[head];
    }

    public void enQueue(int element){
        this.head=0;
        this.rear+=1;
        if(this.rear==this.arr.length){
            doubleCurrentCapacity();
        }
        arr[rear]= element;
    }

    public int deQueue(){
        if(this.isEmpty()){
            throw new UnsupportedOperationException("Stack is empty. Cannot perform Dequeue operation.");
        }
        this.head++;
        return this.arr[head-1];

    }



    /*
    Utility method to double the queue size once the current queue limit exhausts.
     */
    private void doubleCurrentCapacity(){
        CURRENT_CAPACITY*=2;
        int[] tempArr= new int[CURRENT_CAPACITY];

        int i=0;
        for(int element: this.arr){
            tempArr[i]= element;
            i++;
        }
        this.arr= tempArr;
    }
}
