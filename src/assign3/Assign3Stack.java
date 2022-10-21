package assign3;

public class Assign3Stack extends Assign3Queue {
    //declaring queues
    Assign3Queue q1;
    Assign3Queue q2;

    public Assign3Stack() {

        q1 = new Assign3Queue();
        q2 = new Assign3Queue();

    }

    public void push(String text) {
        if (q1.isQueueEmpty()) {
            q1.enqueue(text);
        } else {
            while (!(q1.isQueueEmpty())) {
                q2.enqueue(q1.dequeue());// enqueue all elements from q1 to q2
            }
            q1.enqueue(text);// enqueue text to q1
            while (!(q2.isQueueEmpty())) {
                q1.enqueue(q2.dequeue());// enqueue all elements from q2 to q1
            }
        }
    }

    public String pop() {
        return q1.dequeue();
    }

  

    public int size() { // returns size of Stack
        int length = 0;
        Node temp = q1.head;
        for (temp = q1.head; temp != null; temp = temp.next) {

            length++;
        }
        return length;
    }
    public boolean isStackEmpty() {
        if(q1.head==null) {
            return true;
            
        }else {
            return false;
        }
    }
    
}
