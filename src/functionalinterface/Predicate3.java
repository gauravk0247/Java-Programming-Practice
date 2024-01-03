package functionalinterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String[] args) {
		Predicate<String> pred = (name)->{
		if(name.equalsIgnoreCase("Cyber")) {
			return true;
		}
		return false;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text here");
		String ss = sc.next();
		boolean b = pred.test(ss);
		if(b) 
		{
		System.out.println("login success");
		}
		else {
			System.out.println("login failed");
		}
	}
}