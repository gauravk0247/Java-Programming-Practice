package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Cosumer2 {

	public static void main(String[] args) {
		List<Double>  list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many salary of employee do you want to save");
		int nos = sc.nextInt();
		for(int i=0;i<nos;i++) {
			double sal = sc.nextDouble();
			list.add(sal);
		}
		Consumer<Double> con = (salary)->{
			System.out.println("The salary is "+" "+salary);
		};
		for(Double d:list)
			if(d>1000) {
				con.accept(d);
			}
	}
}