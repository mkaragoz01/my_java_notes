package denemeler;

public class hesap_makinesi_MAİN {

	public static void main(String[] args) {
		int sayi1 = 825;
		int sayi2 = 154;
		
		System.out.println("Sayıların toplamı: "+topla(sayi1,sayi2));
		System.out.println("Sayıların farkı: "+cikar(sayi1,sayi2));
		System.out.println("Sayıların çarpımı: "+carp(sayi1,sayi2));
		System.out.println("Sayıların bölümü: "+bol(sayi1,sayi2));
	}
	
	public static int topla(int num1,int num2) {
		return num1+num2;
	}
	
	public static int cikar(int num1,int num2) {
		return num1-num2;
	}
	
	public static int carp(int num1,int num2) {
		return num1*num2;
	}
	
	public static double bol(double num1,double num2) {
		return num1/num2;
	}

}
