package methodlar;

public class methods {

	public static void main(String[] args) {

		sayiBulma();
		
	}
	
	public static void sayiBulma() {
		
		int[] sayilar = new int[] {1,2,5,6,9,0};
		int aranacak = 0;
		boolean varMi=false;
		for (int sayi: sayilar) {
		if (sayi==aranacak) {
		varMi= true;
		break;
		}
		}
		if (varMi) {
			String mesaj = "Sayı mevcuttur: "+ aranacak;
		message(mesaj);
		} else {
			String mesaj = "Sayı mevcut değildir: "+ aranacak;
			message(mesaj);
	}
	}
	
	public static void message(String mesaj) {
		System.out.println(mesaj);
	}
}