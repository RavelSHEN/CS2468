/**
 * Created by RavelShen on 15/2/2016.
 */
public class testArrayQueue {
    public static void main(String[] args) {
        ArrayQueue myQueue = new ArrayQueue(10);
        myQueue.enqueue(20);
        System.out.println("The front element of the queue is " + myQueue.front());
        System.out.println("The size of the queue after enqueue is " + myQueue.size());
        System.out.println("The deleted element is " + myQueue.dequeue());
        System.out.println("The size of the queue after dequeue is " + myQueue.size());
        for(int i = 0; i <= 11; i ++){
            myQueue.enqueue(i+10);
            System.out.println("The size of the queue is " + myQueue.size());
        }
    }
}
