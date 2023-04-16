package generics;

public class Main {

	public static void main(String[] args) {
		MyList<String> sehirler = new MyList<>();
		sehirler.add("İstanbul");
		//sehirler.add(1); String belirttiğimiz için int atamıyoruz.
		
		
		MyList<Customer> isciler = new MyList<>();
		isciler.add(new Customer());
	}

}
