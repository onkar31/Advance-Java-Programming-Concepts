package QueueExample;

import java.util.LinkedList;

// Queue - First In First Out 

public class Store {

    public static void main(String[] args) {
        
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Rosa"));
        queue.add(new Customer("Oddy"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Penny"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {

        Customer c = queue.poll();
        c.serve();
    }
}