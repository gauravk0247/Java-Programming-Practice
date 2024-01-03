package functionalinterface;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		Predicate<String> pred = (name)->{
			if(name.equalsIgnoreCase("Cyber")) {
				return true;
			}
			return false;
		};
		boolean b = pred.test("cyber");
		System.out.println(b);
	}
}