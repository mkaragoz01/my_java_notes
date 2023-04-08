package methodlar;

public class method2 {

	public static void main(String[] args) {

		int toplam = topla(28,7);
		System.out.println(toplam);
		System.out.println(sehir());
		System.out.println(topla2(1,5,8,9,7,4,6,7,8,4,2,3,9,5));
	}
	
	public static void ekle() {
		
	}
	
	public static void sil() {
		
	}
	
	public static void güncelle() {
		
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;	
	}
	
	public static int topla2(int... sayilar) {//sınırsız değer girmemizi sağlar
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	public static String sehir() {
		return "İzmir";
	}

	
}
