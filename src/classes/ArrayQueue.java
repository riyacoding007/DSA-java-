//  Implement ArrayQueue using shifting array (Simple Array Queue)

// Implements the FIFO ArrayQueue ADT with a fixed capacity.

// Key features:
// - Uses two pointers (front, rear) for O(1) enqueue and O(1) peek.
// - The dequeue operation uses array shifting, resulting in an O(N) time complexity.
// - Includes `isFull()` and `isEmpty()` checks.
// - Provides a basic `toString()` method for viewing the queue contents.


package classes;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private int[] queue;  // Array to store the queue elements
    private int front;    // Index of the front element
    private int rear;   // Index of the last element\
    private int capacity; // Maximum size


    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;     // first element will be added at index 0
        this.rear = -1;    // after adding first element rear will be at index 0
    }
    

        // check if queue is empty
    public boolean isEmpty() {
        return front > rear;
    }
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Add an element to the queue at end
    public void enqueue(int value){
        if(isFull()){
            throw new RuntimeException("Queue is full");  //if capacity is 5 and rear is 4 => array full
        }
        queue[++rear] = value;  // move forward and add element 
    }

    // remove element from front of queue
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int value = queue[front]; // get the front element

        // shift all elemnts by one position to left
        for(int i = front; i < rear; i++){
            queue[i] = queue[i+1];
        }
        rear--; //the end elemnt index decreases means size shrink
        return value;
    }

    // peek the front element
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }


        //Print queue as string
    public String toString() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        String s = "[";
        for(int i = front; i <= rear; i++)
        {
            if(i != front)
            s += ", ";
            s = s + queue[i];// [value1,value2,....]
        }

        s +="]";
        return s;
    }
}
