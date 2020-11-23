public class Driver {

    private static QueueADT<Integer> queue = new ArrayQueue<>();
    private static QueueADT<Integer> linked = new LinkedListQueue<>();

    public static void main(String[] args){
//        queue.enqueue(2);
//        System.out.println("Peek: " + queue.peek());
//        System.out.println("Size: " + queue.size());
//        System.out.println("Dequeue: " + queue.dequeue());
//        System.out.println("Size: " + queue.size());

        System.out.println();
        //
        System.out.println(linked.isEmpty());
        linked.enqueue(2);
        System.out.println("Peek: " + linked.peek());
        System.out.println("Size: " + linked.size());
        System.out.println("Dequeue: " + linked.dequeue());
        System.out.println("Size: " + linked.size());
        linked.enqueue(7);
        linked.enqueue(8);
        linked.enqueue(9);
        System.out.println("Peek: " + linked.peek());
        System.out.println("Size: " + linked.size());
        System.out.println(linked.isEmpty());

    }

}
