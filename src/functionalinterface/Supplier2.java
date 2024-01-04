package functionalinterface;

import java.util.function.Supplier;

class Customer{
	private int custId;
	private String custName;
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
}
public class Supplier2 {
	
	public static void main(String[] args) {
		Supplier<Customer> sup = ()->{
			return new Customer(101, "Gaurav");
		};
		Customer cust = sup.get();
		System.out.println(cust);
	}
}