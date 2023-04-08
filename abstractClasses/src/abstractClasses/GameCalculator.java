package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();// abstarct her classda yeniden oluşturman gerekli demek final ise tam tersi.
	
	public final void GameOver() {
		System.out.println("Oyun Bitti!");
	}
}
