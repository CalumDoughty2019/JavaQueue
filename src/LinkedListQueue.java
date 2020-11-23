import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements QueueADT<E>{

    private LinkedList<E> queue;

    public LinkedListQueue(){
        queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(E element) {
        queue.add(element);
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    @Override
    public E peek() {
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
