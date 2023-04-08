package variablesForJava;

public class reCapDemo {

	public static void main(String[] args) {

		double[] mylist = {1.2,0.6,3.4,8.2};//new double[4];
		double total = 0;
		double max = mylist[0];
		
		for (double number:mylist) {
			total = total + number;
			//System.out.println(number);
		}
		System.out.println("Toplam: "+ total);
		
		for (double num:mylist) {
			if (num>max) {
				max = num;
			}
		}
		
		System.out.println(max);
	}

}
