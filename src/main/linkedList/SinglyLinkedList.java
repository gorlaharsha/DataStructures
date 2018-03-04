package main.linkedList;

import main.linkedList.ListNode;

public class SinglyLinkedList {
    public SinglyLinkedList(){

    }
    //Head of the linked list
    private ListNode head;
    private int length;


    //Getter method for the linked list
    public ListNode getHead() {
        return head;
    }

    //getter and setter for length property
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Method to insert a node at the beginning of the list
     * @param node
     */
    public synchronized void insertAtBeginning(ListNode node){
        node.setNext(head);
        head = node;
        length++;
    }

    /**
     * Print the elements in the singly linked list
     * @param head
     */
    public void printSinglyLinkedList(ListNode head){
        if(head == null) {
            System.out.println("List is Empty");
        }
        else{
            System.out.println("Following are the elements in the list");
            ListNode node = head;
            while(node !=null){
                System.out.println(node.getData());
                node = node.getNext();
            }
        }
    }

    /**
     * Method to insert a node at the end of list
     * @param node
     */
    public synchronized void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
        }
        else{
            ListNode current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(node);

        }
        length++;
    }

    /**
     * Insert node in between the list
     * @param node
     * @param position
     */
    public synchronized void insertAtMiddle(ListNode node, int position){
        if(position <= 1 || length == 0)
            insertAtBeginning(node);
        else if(position > length)
            insertAtEnd(node);
        else{
            ListNode current = head;
            int count = 1;
            while(position - count != 1 ){
                current = current.getNext();
                count++;
            }
            node.setNext(current.getNext());
            current.setNext(node);
            length++;
        }
    }

}
