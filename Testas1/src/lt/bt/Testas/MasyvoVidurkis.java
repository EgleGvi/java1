package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MasyvoVidurkis {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\txt\\array.txt";
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		int[] array = new int [5];
		int i = 0;
		int j = 0;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			array [i] = Integer.parseInt(st);
			i++;
		}
		int sum = 0;
		for (i=0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
		double average = (double)sum/array.length;

		System.out.println(average );
		
		int[] newArray = new int [array.length - 3];
		for (i=0; i<array.length; i++) {
			if(array[i]>average) {
				newArray[j] = array[i];
				System.out.println(newArray[j]);
				j++;
			}
		}
	}
}