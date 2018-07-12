import java.util.*;

class Student
{
	int rollNumber;
	String name,address;
	public Student(int rollNumber,String name,String address)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return this.rollNumber+" "+this.name+" "+this.address;
	}
}
class SortByRoll implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.rollNumber-b.rollNumber;
	}
}
class SortByName implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.name.compareTo(b.name);
	}
}
class Comparable1
{
	public static void main(String[] args) {
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
 		System.out.println("****Sorting by Student Name****");
        SortByName sn=new SortByName();
        Collections.sort(ar,sn);
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 		System.out.println("**Sorting by Roll NUmber***");
        SortByRoll sr=new SortByRoll();
        Collections.sort(ar,sr);
 		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        
	


	}
}