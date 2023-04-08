package variablesForJava;

public class stringDEMO {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		/*
		System.out.println("Eleman sayısı: "+mesaj.length());
		System.out.println("5. eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(", güneşli..."));
		System.out.println(mesaj.startsWith("B"));// mesaj b ile başlıyorsa True
		System.out.println(mesaj.endsWith("."));// mesaj . ile biterse
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);//0 dan 5 e kadar olan değerleri 0 dan başlayarak karaakterlere aktar 
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));// a harfi ilk kaçıncı indekste
		System.out.println(mesaj.lastIndexOf("z"));// sondan başlayarak indisini bulur
		*/
		
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj.substring(2));// 2. indeksten itibaren parçala
		System.out.println(mesaj.substring(2,5));// 2-5 arası
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//küçük harf yapar
		System.out.println(mesaj.toUpperCase());
	}

}
