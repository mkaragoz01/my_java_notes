package overriding;

public class main {
	public static void main(String[] args) {
		// void yerine final yazarak override edilmesini engellemiş oluruz.
		base_kredi_manager[] kredi_managers = new base_kredi_manager[] 
				{new ogretmen_kredi_manager(), new tarim_kredi_manager(), new ogrenci_kredi_manager()};
		// Siz aksini belirtmediğiniz sürece ana işlemi yapar (öğrenci kredisindeki farklılık gibi!!!);
		
		for (base_kredi_manager kredi_manager:kredi_managers) {
			System.out.println(kredi_manager.hesapla(1000));
		}
	}
}
