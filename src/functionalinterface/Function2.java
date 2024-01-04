package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Function2 {

	public static void main(String[] args) {
		Function<List<String>, String> fun = (param)->{
			int maleCounter=0;
			int femaleCounter=0;
			for(int i=0;i<param.size();i++){
				if(param.get(i).startsWith("Mr."))
				{
					maleCounter++;
				}
				else {
					femaleCounter++;
				}
			}
			return "The number of male candidate is "+maleCounter+" "+"The number of female candidate is "+" "+femaleCounter;
		};
		List<String> list = new ArrayList();
		list.add("Mr.");
		list.add("Ms.");
		list.add("Mr.");
		list.add("Ms.");
		list.add("Mr.");
		String s = fun.apply(list);
		System.out.println(s);
	}
}