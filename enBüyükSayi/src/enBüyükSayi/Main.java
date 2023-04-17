package enBüyükSayi;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kaç değer gireceğinizi belirtiniz: ");
		int count = input.nextInt();
		
		ArrayList<Integer> sayilar = new ArrayList<Integer>();
		System.out.println("Lütfen Sayıları giriniz: ");
		
		for (int i=0; i<count; i++) {
			int num = input.nextInt();
			sayilar.add(num);
		}
		
		int maxNum = order(sayilar);
		System.out.println("Girdiğiniz sayıların en büyüğü: "+maxNum);
	}
	
	public static int order(ArrayList liste) {
		int sonuc = (int) liste.get(0);
		
		for (int i = 1; i< liste.size(); i++) {
			int selectNum = (int) liste.get(i);
			if (selectNum>sonuc) {
				sonuc = selectNum;
			}
		}
		return sonuc;
	}
}
