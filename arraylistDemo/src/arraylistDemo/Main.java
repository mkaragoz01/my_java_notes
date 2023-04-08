package arraylistDemo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//int[] sayilar =new int[] {1,2,3};
		//sayilar = new int[4]; bu işe yaramaz
		ArrayList sayilar = new ArrayList(); 
		System.out.println(sayilar.size());
		
		sayilar.add(6);
		sayilar.add(7);
		System.out.println(sayilar.size());
		
		System.out.println(sayilar.get(0));
	}
}
