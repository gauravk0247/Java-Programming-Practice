package functionalinterface;

import java.util.Comparator;

public class Comparator1 {

	public static void main(String[] args) {
		Comparator<Integer> emp = (obj1, obj2)->{
			if(obj1>obj2) 
			{
				return 1;
			}
			else if(obj1<obj2)
			{
				return -1;
			}
			else if(obj1==obj2)
			{
				return 0;
			}
			return -1;
		};
		int status = emp.compare(10, 10);
		System.out.println(status);
	}
}