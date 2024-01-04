package functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator3 {

	public static void main(String[] args) {
		List<Employee> listofemp = new ArrayList();
		listofemp.add(new Employee(101, "Krushna"));
		listofemp.add(new Employee(202, "Vaibhav"));
		listofemp.add(new Employee(303, "Gaurav"));
		listofemp.add(new Employee(404, "Darshan"));
		Comparator<Employee> com = (e1, e2)->{
			return e1.getEmpName().compareTo(e2.getEmpName());
		};
		Collections.sort(listofemp, com);
		for(Employee e:listofemp) {
			System.out.println(e);
		}
	}
}