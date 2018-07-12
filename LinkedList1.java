import java.util.*;


class LinkedList1
{
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Sai");
		list.add("Siddartha");
		list.add("Maram");
		list.add(2,"vikram");
		list.addFirst("Amma");
		list.addLast("Nanna");
		String first=list.getLast();
		String last=list.getFirst();
		System.out.println(last);
		System.out.println(first);
		Iterator<String> i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}