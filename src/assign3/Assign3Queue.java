package assign3;

public class Assign3Queue {
    Node head = null;
    Node tail = null;

    class Node { // creating Single Linked List for Queue
        String text;
        Node next;
    }

    public boolean isQueueEmpty() { // checks if head is null, if yes return true
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public String dequeue() {// returns first element from the queue, null if empty
        if (isQueueEmpty()) {// check if queue is empty
            return null;
        }
        String text = head.text; // loads first item in queue to text
        if (head == tail) {
            tail = tail.next;

        }
        head = head.next;
        return text;

    }

    public void enqueue(String text) {// inserts text to back of queue
        Node prevTail = tail;
        tail = new Node();
        tail.text = text;
        if (isQueueEmpty()) {
            head = tail;
        } else {
            prevTail.next = tail;
        }
    }

}