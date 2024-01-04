package functionalinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {

	public static void main(String[] args) {
		List<Employee> listofemp = new ArrayList();
		listofemp.add(new Employee(404, "Gaurav"));
		listofemp.add(new Employee(303, "Krushna"));
		listofemp.add(new Employee(202, "Vaibhav"));
		listofemp.add(new Employee(101, "Darshan")); 
		Comparator<Employee> com = (e1, e2)->{
			if(e1.getEmpId()<e2.getEmpId()) {
				return -1;
			}
			return 1;
		};
		Collections.sort(listofemp, com);
		for(Employee e:listofemp) {
			System.out.println(e);
		}
	}
}