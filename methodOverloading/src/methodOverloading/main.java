package methodOverloading;

public class main {

	public static void main(String[] args) {

		dortIslem dortislem = new dortIslem();
		int toplama1 = dortislem.topla(7,4); 
		int toplama2 = dortislem.topla(5, 6, 8);
		
		System.out.println(toplama1+"\n"+toplama2);
	}

}
