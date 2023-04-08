package variablesForJava;

public class switchMetodu {

	public static void main(String[] args) {
		char not = 'A';
		
		switch(not) {
			case 'A':
				System.out.println("Mükemmel...");
				break;
			case 'B':
				System.out.println("İyi...");
				break;
			case 'C':
				System.out.println("orta...");
				break;
			case 'D':
				System.out.println("Kötü");
				break;
			case 'E':
				System.out.println("Kaldı!!!");
				break;
			default:
				System.out.println("Geçersiz not!");
		}
	}

}
