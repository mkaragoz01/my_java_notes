package workingWithFiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			readFile();
			writeFile();
			readFile();
		}
	public static void createFile(){
		File file = new File("C:\\Users\\MUHAMMET MUSTAFA\\eclipse-workspace\\files\\students.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya oluşturuldu");
			}else {
				System.out.println("Bu dosya mevcut");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getFileInfo() {
		File file = new File("C:\\Users\\MUHAMMET MUSTAFA\\eclipse-workspace\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya adı: "+ file.getName());
			System.out.println("Dosya yolu: "+ file.getAbsolutePath());
			System.out.println("Dosya yazılabilirlik durumu: "+ file.canWrite());
			System.out.println("Dosya okunabilirlik durumu: "+ file.canRead());
			System.out.println("Dosya boyutu: "+ file.length());
		}
	}
	public static void readFile() {
		File file = new File("C:\\Users\\MUHAMMET MUSTAFA\\eclipse-workspace\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\MUHAMMET MUSTAFA\\eclipse-workspace\\files\\students.txt",true)); 
			writer.newLine();
			writer.write("Yönetim Bilişim Sistemleri");
			System.out.println("Dosyaya yazma işlemi başarıyla gerçekleşti");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
