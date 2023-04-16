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
		sayilar.add("İzmir");
		sayilar.add(18);
		/*
		System.out.println(sayilar.size());
		
		System.out.println(sayilar.get(0));
		sayilar.set(0, 12);// belirtilen indexte bulunan değeri güncellememizi sağlar.
		System.out.println(sayilar.get(0));
		sayilar.remove(0);// silme
		System.out.println(sayilar);
		
		sayilar.clear();//tamamını temizler
		System.out.println(sayilar);
		*/
		
		for (Object i:sayilar) {
			System.out.println(i);
		}
	}
}
