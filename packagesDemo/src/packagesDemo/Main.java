package packagesDemo;

import java.util.Scanner;

import matematik.UsAlma;
import matematik.dortİslem;

public class Main {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("İsim Giriniz: ");
		String isim = scanner.nextLine();
		System.out.println("Merhaba "+isim);*/
		
		dortİslem islemler = new dortİslem();
		System.out.println(islemler.topla(16, -10));
		
		UsAlma ustu = new UsAlma();
		System.out.println(ustu.ussu(2, 3));
	}
}
