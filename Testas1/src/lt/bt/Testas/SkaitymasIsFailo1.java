package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SkaitymasIsFailo1 {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\txt\\Tekstas.txt";
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();
	}
}
