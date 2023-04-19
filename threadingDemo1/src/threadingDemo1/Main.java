package threadingDemo1;

public class Main {

	public static void main(String[] args) {
		//threading ir projenin çalışması sırasında işlemlerin gerçekleşme durumudur.
		//single threading projenin sırayla tek bir zaman çizgisi üzerinde gerçekleşmesine denir.
		//multi threading ise bir kaç zaman çizelgesi üzerinde aynı sürede farklı işlemler yapılmasına izin verilme durumuna denilmektedir.
		
		KronometreThread thread1 = new KronometreThread("thread1");
		KronometreThread thread2 = new KronometreThread("thread2");
		KronometreThread thread3 = new KronometreThread("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
