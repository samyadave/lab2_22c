package lab2_22;

/**
	 * Defines a doubly-linked list class
	 * @author
	 * @author
	 */

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private class Node {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private int length;
    private Node first;
    private Node last;
    private Node iterator;

    /**** CONSTRUCTORS ****/

    /**
     * Instantiates a new LinkedList with default values
     * 
     * @postcondition <fill in here>
     */
    public LinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    /**
     * Converts the given array into a LinkedList
     * 
     * @param array the array of values to insert into this LinkedList
     * @postcondition <fill in here>
     */
    public LinkedList(T[] array) {
        this.first = new Node(array[0]);
        this.last = new Node(array[array.length - 1]);

    }

    /**
     * Instantiates a new LinkedList by copying another List
     * 
     * @param original the LinkedList to copy
     * @postcondition a new List object, which is an identical,
     *                but separate, copy of the LinkedList original
     */
    public LinkedList(LinkedList<T> original) {

    }

    /**** ACCESSORS ****/

    /**
     * Returns the value stored in the first node
     * 
     * @precondition <fill in here>
     * @return the value stored at node first
     * @throws NoSuchElementException <fill in here>
     */
    public T getFirst() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException("No first element");
        }

        return this.first.data;
    }

    /**
     * Returns the value stored in the last node
     * 
     * @precondition <fill in here>
     * @return the value stored in the node last
     * @throws NoSuchElementException <fill in here>
     */
    public T getLast() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException("No first element");
        }

        return this.last.data;
    }

    /**
     * Returns the data stored in the iterator node
     * 
     * @precondition <fill in here>
     * @throw NullPointerException <fill in here>
     */
    public T getIterator() throws NullPointerException {
        return null;
    }

    /**
     * Returns the current length of the LinkedList
     * 
     * @return the length of the LinkedList from 0 to n
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Returns whether the LinkedList is currently empty
     * 
     * @return whether the LinkedList is empty
     */
    public boolean isEmpty() {
        return this.length == 0;
    }

    /**
     * Returns whether the iterator is offEnd, i.e. null
     * 
     * @return whether the iterator is null
     */
    public boolean offEnd() {
        return false;
    }

    /**** MUTATORS ****/

    /**
     * Creates a new first element
     * 
     * @param data the data to insert at the front of the LinkedList
     * @postcondition <fill in here>
     */
    public void addFirst(T data) {
        this.first.prev = new Node(data);
        this.first = this.first.prev;
    }

    /**
     * Creates a new last element
     * 
     * @param data the data to insert at the end of the LinkedList
     * @postcondition <fill in here>
     */
    public void addLast(T data) {
        this.last.next = new Node(data);
        this.last = this.last.next;
    }

    /**
     * Inserts a new element after the iterator
     * 
     * @param data the data to insert
     * @precondition <fill in here>
     * @throws NullPointerException <fill in here>
     */
    public void addIterator(T data) throws NullPointerException {
        return;
    }

    /**
     * removes the element at the front of the LinkedList
     * 
     * @precondition <fill in here>
     * @postcondition <fill in here>
     * @throws NoSuchElementException <fill in here>
     */
    public void removeFirst() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }

        this.first = this.first.next;
        this.first.prev = null;
    }

    /**
     * removes the element at the end of the LinkedList
     * 
     * @precondition <fill in here>
     * @postcondition <fill in here>
     * @throws NoSuchElementException <fill in here>
     */
    public void removeLast() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }

        this.last = this.last.prev;
        this.last.next = null;
    }

    /**
     * removes the element referenced by the iterator
     * 
     * @precondition <fill in here>
     * @postcondition <fill in here>
     * @throws NullPointerException <fill in here>
     */
    public void removeIterator() throws NullPointerException {

    }

    /**
     * places the iterator at the first node
     * 
     * @precondition <fill in here>
     * @postcondition <fill in here>
     * @throws NullPointerException <fill in here>
     */
    public void positionIterator() {

    }

    /**
     * Moves the iterator one node towards the last
     * 
     * @precondition <fill in here>
     * @postcondition <fill in here>
     * @throws NullPointerException <fill in here>
     */
    public void advanceIterator() throws NullPointerException {

    }

    /**
     * Moves the iterator one node towards the first
     * 
     * @precondition <fill in here>
     * @postcondition <fill in here>
     * @throws NullPointerException <fill in here>
     */
    public void reverseIterator() throws NullPointerException {

    }

    /**** ADDITIONAL OPERATIONS ****/

    /**
     * Converts the LinkedList to a String, with each value separated by a blank
     * line At the end of the String, place a new line character
     * 
     * @return the LinkedList as a String
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * Determines whether the given Object is
     * another LinkedList, containing
     * the same data in the same order
     * 
     * @param o another Object
     * @return whether there is equality
     */
    @SuppressWarnings("unchecked") // good practice to remove warning here
    @Override
    public boolean equals(Object o) {
        return false;
    }

    /** CHALLENGE METHODS */

    /**
     * Zippers two LinkedLists to create a third List
     * which contains alternating values from this list
     * and the given parameter
     * For example: [1,2,3] and [4,5,6] -> [1,4,2,5,3,6]
     * For example: [1, 2, 3, 4] and [5, 6] -> [1, 5, 2, 6, 3, 4]
     * For example: [1, 2] and [3, 4, 5, 6] -> [1, 3, 2, 4, 5, 6]
     * 
     * @param list the second LinkedList in the zipper
     * @return a new LinkedList, which is the result of
     *         zippering this and list
     * @postcondition this and list are unchanged
     */
    public LinkedList<T> zipperLists(LinkedList<T> list) {
        return null;
    }

    /**
     * Determines whether a LinkedList is
     * reversible, i.e. the data is the same
     * written both forward and backward
     * e.g. isReversible(1 2 3 2 1) -> true
     * e.g. isReversible(A B B A) -> true
     * 
     * @return whether the list is reversible
     */
    public boolean isReversible() {
        return false;
    }
}
