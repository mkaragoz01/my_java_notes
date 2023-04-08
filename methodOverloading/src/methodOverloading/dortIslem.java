package methodOverloading;

public class dortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	//aynı isimde iki fonksiyon olabilir hangisinin isteği gerçekleşirse o çalışır.
	//buna methos overloading denir.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}
}
