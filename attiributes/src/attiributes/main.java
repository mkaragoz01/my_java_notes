package attiributes;

public class main {

	public static void main(String[] args) {

		product product = new product(2,"Telefon","İphone",8500,3);
/*	
İki türlü de kullanılmaktadır.Buna Constructor denir.

	    product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmound(3); 
	*/			
		
		productManager productManager = new productManager();
		productManager.add(product);
		
		System.out.println("id: "+product.getId());
		System.out.println("ad: "+product.getName());
		System.out.println("özellik: "+product.getDescription());
		System.out.println("stok: "+product.getStockAmound());
		System.out.println("fiyat: "+product.getPrice());
		System.out.println("ürün kodu: "+product.getKod());
	}	

}
