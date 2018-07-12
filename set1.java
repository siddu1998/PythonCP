import java.util.*;
class set1
{
public static void main(String[] args)
 {
		Set<Integer>s=new HashSet<Integer>();
		int[] a=new int[]{1,2,3,2,2,2};;
		
		for(int i=0;i<a.length;i++){
			s.add(a[i]);
		}
		System.out.println(s.size()+"distinct elements"+s);
	}	
}