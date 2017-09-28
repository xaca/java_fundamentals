import java.util.*;

class Node{
    char data;
    Node next;

    Node(char data){
        this.data = data;
        this.next = null;
    }

    boolean hasNext(){
        return (next != null ? true : false);
    }
}

class LinkedList{
    Node head;
    Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    public LinkedList(String str){
        this.stringToLL(str);
    }

    public void stringToLL(String str){
        /* Converts a string to a LinkedList */
        head = null;
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            this.addNodeAtEnd(c);
        }
    }

    public void addNodeAtEnd(char item){
        /* Adds nodes at the ending of a linked list */
        Node node = new Node(item);
        if(head == null){
            head = node;
            tail = node;
            head.next = tail;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void display(){
        /* Prints the linked list */
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node list){
        /* Recursive version of linked list reversal */
        if(!list.hasNext()){
            return list;
        }
        reverse(list.next).next = list;
        return list;
    }

    public static void reverse_wrapper(LinkedList list){
        /* Wrapper to the recursive reversal function */
        Node cur = list.head;
        while(cur.hasNext()){
            cur = cur.next;
        }
        reverse(list.head).next = null;
        list.head = cur;
    }
}

public class LinkedListReversal {
    public static void main(String[] args){
        LinkedList list = new LinkedList("hellothere");
		    System.out.println("Original List:");
		    list.display(); 
		
        LinkedList.reverse_wrapper(list);
		    System.out.println("\nReversed List:");
        list.display();
    }
}
