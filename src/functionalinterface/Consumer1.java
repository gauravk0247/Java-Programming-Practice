package functionalinterface;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		Consumer<Integer> con = (num)->{
			System.out.println("The square of no is "+" "+(num*num));
		};
		con.accept(2);
	}
}