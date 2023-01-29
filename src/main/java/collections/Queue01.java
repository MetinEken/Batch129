package collections;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {
        TreeSet jhdsj=  new TreeSet<>();
        jhdsj.add(1);
        jhdsj.add(1);
        jhdsj.add(2);

        System.out.println(jhdsj);
        Queue<Object> myQueue = new PriorityQueue();
        myQueue.add(1);
myQueue.add(2);
myQueue.add(233);
myQueue.add(3);
        myQueue.add(1);
        System.out.println(myQueue);
        System.out.println(  myQueue.element());
        System.out.println(  myQueue.element());
        System.out.println(myQueue);
        System.out.println(  myQueue.poll());
        System.out.println(myQueue);
        System.out.println(  myQueue.peek());
        System.out.println(myQueue);
        System.out.println(  myQueue.poll());
        System.out.println(myQueue);
        System.out.println(  myQueue.element());
        System.out.println(  myQueue.poll());
        System.out.println(  myQueue.remove());
        System.out.println("son "+myQueue);
        System.out.println(  myQueue.poll());
//        System.out.println(  myQueue.peek());
//        System.out.println(  myQueue.remove());
//        System.out.println(  myQueue.element());
        Deque d = new LinkedList();
        d.add(12);
        d.add("sdfs");
        d.add("asd");
        System.out.println(d);

    }
}
