package matematik;

public class UsAlma {
	public int ussu(int taban, int kuvvet) {
		int sayi = 1;
		for (int i=0; i<kuvvet; i++) {
			sayi = taban * sayi;
		}
		return sayi;
	}
}
