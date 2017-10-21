// Recursive Java program to count number of nodes in 
// a linked list
 
// Linked List class
class LLCountNodes
{
    Node head;  // head of list
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    /* Returns count of nodes in linked list */
    public int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;
 
        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }
 
    /* Wrapper over getCountRec() */
    public int getCount()
    {
        return getCountRec(head);
    }

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }


    /* Drier program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args)
    {
        /* Start with the empty list */
        LLCountNodes llist = new LLCountNodes();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
 
        System.out.println("Count of nodes is " +
                           llist.getCount());
    }
}