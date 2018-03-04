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

}
