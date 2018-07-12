import java.util.*;
class ListInterators1
{
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin"); 

		System.out.println(al.get(2));

		ListIterator<String> i = al.listIterator();
		System.out.println("Forward");
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("backward");
		while(i.hasPrevious())
			System.out.println(i.previous());


	}
}