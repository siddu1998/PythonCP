import java.util.*;



//start of LinkedList class
class LinkedList{
	Node head,end,current=null;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	void add(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			end=head;
		}
		else
		{
			current=new Node(data);
			end.next=current;
			end=current;
		}
	}


	static void removeDuplicate(Node head) 
    {
        
        HashSet<Integer> hs = new HashSet<>();
     
        
        Node current = head;
        Node prev = null;
        while (current != null) 
        {
            int curval = current.data;
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
 
    }
	static void printList(Node head) 
    {
        while (head!= null) 
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
	//end of LinkedList class
	
public static void main(String[] args) {
	LinkedList l=new LinkedList();

	l.add(2);
	l.add(3);
	l.add(1);
	l.add(2);
	l.add(4);
	printList(l.head);
	removeDuplicate(l.head);
	System.out.println();
	printList(l.head);
	
}


}