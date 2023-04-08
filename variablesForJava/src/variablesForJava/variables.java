package variablesForJava;

public class variables {

	public static void main(String[] args) {
		//reusability : tekrar tekrar kullanabilirlik
		int sayi = 10;
		String mesaj = "Toplam";
		System.out.println("Toplam: "+sayi);
		sayi = sayi + 1;
		System.out.println(mesaj+": "+sayi);
		char karakter = 'a';//ascii tablosunda bir sayıya eş
		double ikili = 12.5;
		byte deger = 4;
		long puan = 125468;
		System.out.println(karakter+ikili+deger+puan);
		boolean dogruluk = false;
		
		if(dogruluk != true) {
			System.out.println("Döngüde Şuan");
		}

	}

}
