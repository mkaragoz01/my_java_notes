package staticDemo;

public class ProductValidator {
	static {
		// newleme işlemi olmadan direkt çalışır.
		System.out.println("Static yapıcı blok çalıştı");
	}
	public ProductValidator() {
		// Bu blok newlersek çalışır.
		System.out.println("Yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void orneklem() {
		// Bunu çağırabilmemiz için classı newlememiz gerekir
		// ama diğeri için gerekmez
	}
	public static class deneme{
		// Bu işleme inner class deni
		// Bu classlar static yapılabilir ama ana classı yapamazsın.
		public static void sil() {
			
		}
	}
}
