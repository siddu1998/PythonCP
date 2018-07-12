import java.util.*;

class ArrayList1
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Sai");
		list.add("Maram");
		Iterator i=list.iterator();
		System.out.println(list.get(2));
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
