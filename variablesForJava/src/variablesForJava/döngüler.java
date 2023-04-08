package variablesForJava;

public class döngüler {

	public static void main(String[] args) {
		
		//for
		
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü bitti!");
		
		//while
		
		int i = 10;
		while (i!=0){
			System.out.println(i);
			i--;
		}
		System.out.println("While döngüsü bitti!");
		
		//Do-While
		
		do {
			System.out.println(i);
			i++;
		}while (i<10);
		System.out.println("Do-While döngüsü bitti!");
	}

}
