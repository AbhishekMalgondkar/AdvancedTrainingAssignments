package problem_statement_13;

class LinkedList {
	NodeLinkedList head;
 
    class NodeLinkedList {
        int data;
        NodeLinkedList next;
        NodeLinkedList(int d)
        {
            data = d;
            next = null;
        }
    }
 
    void printNthFromLast(int n)
    {
        int len = 0;
        NodeLinkedList temp = head;
 
        while (temp != null) {
            temp = temp.next;
            len++;
        }
 
        if (len < n)
            return;
 
        temp = head;
 
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }
 
    public void push(int new_data)
    {
     
    	NodeLinkedList new_node = new NodeLinkedList(new_data);
 
        new_node.next = head;
 
        head = new_node;
    }
 
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(10);
        llist.push(20);
        llist.push(30);
        llist.push(40);
 
        llist.printNthFromLast(4);
    }
}