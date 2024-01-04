package functionalinterface;

import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		Supplier<String> sup = ()->{
			return "Welcome to cyber success";
		};
		String s = sup.get();
		System.out.println(s);
	}
}