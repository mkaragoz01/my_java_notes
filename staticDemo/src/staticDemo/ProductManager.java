package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator productValidator = new ProductValidator();
		//ProductValidator classını static yaparsak bu şekilde nesne oluşturmamıza gerek kalmaz.
		// ama static yaparak bir kullanım yaparsak ana classda yapılır diğerinde ise örnekte.
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");	
		}
		ProductValidator productValidator = new ProductValidator();
		productValidator.orneklem();
	}
}
