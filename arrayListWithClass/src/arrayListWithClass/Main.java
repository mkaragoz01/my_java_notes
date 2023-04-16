package arrayListWithClass;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer muka = new Customer(1, "Mustafa", "Karagöz");
		customers.add(muka);
		customers.add(new Customer(2, "Muhammet", "Karagöz"));
		
		//customers.remove(new Customer(2, "Muhammet", "Karagöz")); Bu şekilde remove edilemez
		//customer.remove(muka); Bu şekilde edilebilir.
		
		
		for(Customer customer:customers) {
			System.out.println(customer.firstName);
		}
	}

}
