package variablesForJava;

public class mükemmelSayi {

	public static void main(String[] args) {

		int sayi = 28;
		int toplam = 0;
		
		for (int i=1;i<sayi;i++) {
			if (sayi % i == 0) {
				toplam = i + toplam;
			}
		}
		
		if (sayi == toplam) {
			System.out.println("Mükemmel Sayı");
		}else {
			System.out.println("Mükemmel değil");
		}
	}

}
