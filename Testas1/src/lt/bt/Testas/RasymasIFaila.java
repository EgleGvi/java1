package lt.bt.Testas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;


public class RasymasIFaila {
	
	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\tekstas.txt";
		String content = "This is the content to write into file\n";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		System.out.println("Done");
		bw.close();
		fw.close();
	}
}