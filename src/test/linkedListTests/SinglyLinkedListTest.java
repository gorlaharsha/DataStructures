package test.linkedListTests;

import main.linkedList.ListNode;
import main.linkedList.SinglyLinkedList;
import org.junit.Assert;
import org.junit.Test;


public class SinglyLinkedListTest {


    @Test
    public void insertAtMiddleTestSuccess(){
        SinglyLinkedList singleLinkedList = new SinglyLinkedList();
        ListNode node = new ListNode(1,null);
        singleLinkedList.insertAtMiddle(node,1);
        ListNode node1 = new ListNode(2,null);
        singleLinkedList.insertAtMiddle(node1,4);
        ListNode node2 = new ListNode(3,null);
        singleLinkedList.insertAtMiddle(node2, 2);
        ListNode node3 = new ListNode(4,null);
        singleLinkedList.insertAtMiddle(node3, 2);
        Assert.assertEquals(singleLinkedList.getLength(), 4);

    }

    @Test
    public void deleteAtBeginningTestSuccess(){
        SinglyLinkedList singleList = new SinglyLinkedList();
        ListNode node = new ListNode(1,null);
        ListNode node1 = new ListNode(2,null);
        singleList.insertAtMiddle(node1,4);
        singleList.insertAtBeginning(node);
        ListNode delNode = singleList.deleteAtBeginning();
        Assert.assertEquals(delNode.getData(), node.getData());

    }

    @Test
    public void deleteAtEndTestSuccess(){
        SinglyLinkedList singleList = new SinglyLinkedList();
        ListNode node = new ListNode(1,null);
        ListNode node1 = new ListNode(2,null);
        singleList.insertAtMiddle(node1,4);
        singleList.insertAtBeginning(node);
        ListNode delNode = singleList.deleteAtEnd();
        Assert.assertEquals(delNode.getData(), node1.getData());
    }

    @Test
    public void deleteGivenNodeSuccess(){
        SinglyLinkedList singleList = new SinglyLinkedList();
        ListNode node = new ListNode(1,null);
        ListNode node1 = new ListNode(2,null);
        singleList.insertAtMiddle(node1,4);
        singleList.insertAtBeginning(node);
        singleList.deleteNode(1);
        singleList.printSinglyLinkedList();
        Assert.assertEquals(singleList.getLength(), 1);
    }
}
