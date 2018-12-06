package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MasyvoVidurkis {

	public static void main(String[] args) throws IOException {
		MasyvoVidurkis();
	}

	public static void MasyvoVidurkis() throws IOException {
		int[] positive = new int [4];
		int[] negative = new int [1];
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
		int positiveIndex = 0;
		int negativeIndex = 0;
		for (i=0; i < array.length; i++) {
			if(array[i] >= 0) {
				positive[positiveIndex] = array[i];
				positiveIndex++;
			}
			else {
				negative[negativeIndex] = array[i];
				negativeIndex++;
			}
		}
		positive = sortArray(positive);
		System.out.println("Teigiami: ");
		for (i=0; i < positive.length; i++) {
			System.out.println(positive[i]);
		}
		System.out.println("Neigiami: ");
		for (i=0; i < negative.length; i++) {
			System.out.println(negative[i]);
		}	
	}
	
	public static int[] sortArray( int[] array) {
		for (int j = 0; j < array.length; j++) {
			for(int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i+1]) {
					int laikinas = array[i];
					array[i] = array[i+1];
					array[i+1] = laikinas;
				}
			}
		}
		return array;
	}
}
