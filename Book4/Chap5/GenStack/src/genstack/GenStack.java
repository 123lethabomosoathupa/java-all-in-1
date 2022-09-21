/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genstack;

/**
 *
 * @author letha
 */
import java.util.*;

public class GenStack<E> {                                  //Parameter <E>Thus users of this class can specify the type for the stack’s elements.

    private LinkedList<E> list = new LinkedList<E>();

    public void push(E item) {
        list.addFirst(item);                                //used to insert a specific element at the beginning of a LinkedList
    }

    public E pop() {
        return list.poll();                                 //used to retrieve or fetch and remove the first element of the Queue or the element present at the head of the Queue
    }

    public E peek() {
        return list.peek();                                 //retrieve or fetch the first element of the Stack or the element present at the top of the Stack
    }

    public boolean hasItems() {
        return !list.isEmpty();                             //checks whether a string is empty or not
    }

    public int size() {
        return list.size();                                 //used to get the number of elements in this list
    }
}
