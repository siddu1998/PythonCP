import java.util.*;

class queue1
{
	public static void main(String[] args) {
		System.out.println("Please enter the numebr of elements you want to in the queue");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	Queue<Integer>q=new LinkedList<Integer>();
	for(int i=0;i<n;i++){
		int k=sc.nextInt();
		q.add(k);
	}
	while(!q.isEmpty())
	{	
		System.out.println(q.remove());
		System.out.println(q.poll());
	}
	}
}