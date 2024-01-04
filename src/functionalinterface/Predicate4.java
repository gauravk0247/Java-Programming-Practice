package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate4 {

	public static void main(String[] args) {
	Predicate<List<String>> pred = (user)->{
		String  username= user.get(0);
		String password=user.get(1);
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123"))
		{
			return true;
		}
		return false;
	};
	List<String> listname = new ArrayList();
	listname.add("admin");
	listname.add("admin@123");
	if(pred.test(listname)) {
		System.out.println("Login Success");
	}else {
		System.out.println("Login Failed");
	}
	}
}