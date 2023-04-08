package overriding;

public class ogrenci_kredi_manager extends base_kredi_manager{
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
