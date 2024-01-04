package functionalinterface;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		Function<Integer, String> fun = (prodid)->{
			return "Product id is "+" "+prodid;
		};
		String s = fun.apply(125);
		System.out.println(s);
	}
}