import java.util.*;
class HashTest1
{
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("Sai");
		set.add("Maram");
		set.add("Siddartha");

		Iterator<String>i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
}