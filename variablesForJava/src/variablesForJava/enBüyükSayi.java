package variablesForJava;

public class enBüyükSayi {

	public static void main(String[] args) {
		int a = -5;
		int b = 0;
		int c = 8;
		int buyuk = 0;
		int orta = 0;
		int kucuk = 0;
		
		if (a>c && a > b) {
			buyuk = a;
			if (b > c) {
				orta = b;
				kucuk = c;
			}else {
				kucuk = b;
				orta = c;
			}
		}else if(b>c && b > a) {
			buyuk = b;
			if (a > c) {
				orta = a;
				kucuk = c;
			}else {
				orta = c;
				kucuk = a;
			}
		}else {
			buyuk = c;
			if (a>b) {
				orta = a;
				kucuk = b;
			}else {
				orta = b;
				kucuk = a;
			}
		}
		System.out.println("en buyuk: "+buyuk+'\n'+
				"orta: "+orta+'\n'+
				"küçük: "+kucuk);

	}

}
