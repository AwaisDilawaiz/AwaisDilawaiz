package javaapplication26;

class Node 
{ 
    int data; 
    Node next; 
  
    public Node(int data) 
    { 
        this.data = data; 
        this.next = null; 
    } 
} 

class Queue
{ 
    Node front, rear; 
  
    public Queue() 
    { 
        front = rear = null; 
    } 
  
    public void enqueue(int data) 
    { 
        Node temp = new Node(data); 
        
        if (rear == null)
	{ 
            front = rear = temp; 
            return; 
        } 
         
        rear.next = temp; 
        rear = temp; 
    } 
    
    void dequeue() 
    { 
        if (front == null) 
	{
            System.out.println("OLA!");
	    return; 
	}          
  
        Node temp = front; 
        front = front.next; 
         
        if (front == null) 
        {
            rear = null; 
        } 
    }
}
  
public class JavaApplication26{ 
    public static void main(String[] args) 
    { 
        Queue q = new Queue(); 
       
        q.dequeue();
        q.enqueue(20); 
        q.enqueue(30); 
        q.dequeue(); 
        q.dequeue(); 

        q.enqueue(40); 
        q.enqueue(50); 
        q.enqueue(60); 
        q.dequeue(); 
    } 
}