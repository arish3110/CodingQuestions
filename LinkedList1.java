import java.util.LinkedList;

public class LinkedList1 {
    static Node head;
    static class Node{
        int data;
        Node next;
       Node(int d){
           data=d;
           next=null;
       }
    }
     Node reverse(Node node){
        Node prev=null;
        Node curr= head;
        Node next=null;
        while(curr != null){
            next =curr.next;
            curr.next= prev;
            prev= curr;
            curr=next;
        }
        node =prev;
        return node;
     }

     void printList(Node node){
        while(node != null){
            System.out.println(node.data +" ");
            node =node.next;
        }
     }
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
