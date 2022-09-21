/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genqueue;

/**
 *
 * @author letha
 */
import java.util.*;

public class GenQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addLast(item);
    }

    public E dequeue() {
        return list.poll();
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q) {
        while (q.hasItems()) {
            list.addLast(q.dequeue());
        }
    }
}
