package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LyginisNelyginis {

	public static void main(String[] args) throws IOException {
		lyginisNelyginis();
	}
	
	public static void lyginisNelyginis() throws IOException{
	String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\txt\\text.txt";
	File file = new File(filePath);
	BufferedReader reader = new BufferedReader(new FileReader(file));
	int number;
	String line;
	while ((line = reader.readLine()) != null) {
		number = Integer.parseInt(line);
		if (number % 2 == 1) {
			System.out.print(number);
			System.out.println(" - nelyginis");
		}
		else {
			System.out.print(number);
			System.out.println(" - lyginis");
		}
	}
	reader.close();
}
}
