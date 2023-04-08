package classYapısı;

public class classYapi {

	public static void main(String[] args) {

		CustomerManager classes = new CustomerManager();// ikinci yazdığımız taktığımız isim
		classes.add();
		classes.remove();
		classes.update();
		
		// value değerlerde farklı frekanslar oluşur ve eskiyi etkilemez.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		// Dizilerde class yapısı gibi referans alınanda değişiklik olursa alanda da olur. Aynı nesneye farklı isim vermek gibi bir şey olur.
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 9;
		System.out.println(sayilar2[0]);
		
	}

}

