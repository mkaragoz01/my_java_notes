package variablesForJava;

public class sayıBulma {

	public static void main(String[] args) {

		int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9};
		
		int search = 9;
		
		for (int num : sayilar) {
			if (search == num) {
				System.out.println("Sayı dizinin içinde var");
				break;
			}else if(num != search && num == sayilar[sayilar.length-1]){
				System.out.println("Dizide yok");
			}
		}
	}

}
