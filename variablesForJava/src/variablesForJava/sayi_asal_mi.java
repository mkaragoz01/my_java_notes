package variablesForJava;

public class sayi_asal_mi {

	public static void main(String[] args) {

		int number = 91;
		
		for (int i=2;i<=(number);i++) {
			System.out.println(i);
			if (number % i == 0) {
				if (number == 2) {
					System.out.println("Asal sayı");

				}else if(number == i) {
					System.out.println("Asal sayı");
					
				}else {
					System.out.println("Sayı asal değildir");
					
				}
				break;
				
			}else if (number-1 == i && number % i !=0) {
				System.out.println("Asal sayı");
				break;
			}
		}
	}

}
