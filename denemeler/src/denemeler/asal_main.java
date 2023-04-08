package denemeler;

public class asal_main {

	public static void main(String[] args) {
		int num = 97;
		boolean now = false;
		
		for (int i=2;i<num;i++) {
			if (num % i == 0) {
				now = true;
				break;
			}
		}
		
		if (now == true) {
			System.out.println(num+"-->Asal Değil");
		}else {
			System.out.println(num+"-->Asal Sayı");
		}
	}

}
