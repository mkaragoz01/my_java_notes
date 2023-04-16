package exceptionHandling;

public class Main {
	public static void main(String[] args) {
		
		try {
			String sehir = "Ankara";
			int[] sayilar = new int[] {1,2,3};
			
			System.out.println(sayilar[5]);
		}catch (StringIndexOutOfBoundsException exception) {
			System.out.println("Hata 1: "+exception);
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Hata 2: "+exception);
		}catch(Exception exception) {
			System.out.println(exception);
		}finally {
			System.out.println("Bu bir Finally bloğudur. Hata olsa da olmasada çalışır.");
		}
	}
}
