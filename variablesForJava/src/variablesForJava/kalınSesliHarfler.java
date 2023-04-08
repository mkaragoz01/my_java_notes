package variablesForJava;

public class kalınSesliHarfler {

	public static void main(String[] args) {

		char harf = 'E';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli bir harf");
			break;
			default:
				System.out.println("İnce sesli bir harf");
		}
		
		/*
		if (harf == 'A') {
			System.out.println("A kalın sesli bir harf");
		}else if(harf == 'E') {
			System.out.println("E ince sesli bir harf");
		}*/
	}

}
