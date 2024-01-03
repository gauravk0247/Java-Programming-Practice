package functionalinterface;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		Predicate<Integer> pred = (p1)->{
			if(p1==100) {
				return true;
			}
			return false;
		};
		boolean b = pred.test(100);
		System.out.println(b);
	}
}