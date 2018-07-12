import java.util.*;
class map1
{
	public static void main(String[] args) {
		Map<String,Integer>m=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of words");
		int n=sc.nextInt();
		String sen[]=new String[5];
		for(int i=0;i<5;i++)
		{
			sen[i]=sc.nextLine();
		}
		for(String s:sen)
		{
			Integer frequency=m.get(s);

			m.put(s,(frequency==null)?1:frequency+1);
		}

	System.out.println(m);
	for(String key:m.keySet())
	{
		System.out.println(key);
	}
	}	
}