package abstractClasses;

public class Main {

	public static void main(String[] args) {

		WomanGameCalculator WomanGameCalculator = new WomanGameCalculator();
		WomanGameCalculator.hesapla();
		WomanGameCalculator.GameOver();
		
		// abstaract sınıflardan nesne oluşturulamaz onların amacı kalıtımda kullanılıp override etmek
		// GameCalculator GameCalculator = new GameCalculator() 
		
		// ancak bu şekilde kullanılabilir
		GameCalculator GameCalculator = new WomanGameCalculator();
		
	}

}
