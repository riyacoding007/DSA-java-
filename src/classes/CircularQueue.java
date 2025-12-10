package classes;

import java.util.NoSuchElementException;

public class CircularQueue {
    int[] queue;
    int front;
    int size;
    int capacity;
    int rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.size = 0;  
        this.rear = -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity - 1;
    }
    public void enqueue(int value) {
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }
        rear = (front + size) % capacity;
        queue[rear] = value;
        size++;
    }
    public int dequeue() {
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }
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
