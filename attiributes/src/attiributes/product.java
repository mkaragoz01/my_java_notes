package attiributes;

public class product {
	
	public product(int id, String name, String description, double price, int stockAmound) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmound = stockAmound;
	}
	
	public product() {
		
	}
	// attribute veya field denilir
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmound;
	private String kod;
	// private sadece tanımlı olduğu blokta geçerli demek
	
	public int getId() {
		return id;
	}
	// get okuyabilmeyi sağlar set yazmayı da sağlar
	public void setId(int id) {
		this.id=id;//id=id yapabilirsin ama bu kullanım daha doğru
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	
	public int getStockAmound() {
		return stockAmound;
	}
	
	public void setStockAmound(int stockAmound) {
		this.stockAmound=stockAmound;
	}
	
	
	public String getKod() {
		return this.name.substring(0,1) + id;
	}
	
	public void setKod(String kod) {
		this.kod=kod;
	}
}
