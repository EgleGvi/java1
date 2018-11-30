package lt.bt.Kontrolinis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VariantasA {

	public VariantasA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		skaitymas();
		ilgiausias();
		trumpiausias();
	}

	public static void skaitymas() throws IOException {
		String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\src\\lt\\bt\\Kontrolinis\\txt\\DuomenysA.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int i;
        double sum = 0;
        double[] array = new double [scanner.nextInt()];
        for(i=0; i <array.length; i++) {
        	array[i] = scanner.nextDouble();
        	System.out.println(array[i]);
        	
        }
        
        String fileName = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\src\\lt\\bt\\Kontrolinis\\txt\\result.txt";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
    	for(i=1; i < 11; i++) {
    		sum = sum + array[i];
    	}
    	bw.write("Troleibuso marsruto ilgis yra " + sum);
		bw.newLine();
		
		System.out.println("Done");
		bw.close();
		fw.close();
		scanner.close();
    }
     
	public static void ilgiausias() {
		double[] array = {1400, 950, 750, 1500, 850, 2300, 1000, 750, 900, 700};
		double max = array[0];
		for ( int i=1; i<array.length; i++) {
            if (array[i]>max) {
                 max = array[i];
            }	
	}System.out.println("Ilgiausias atstumas yra " + max);
	}	
	
	public static void trumpiausias() {
		double[] array = {1400, 950, 750, 1500, 850, 2300, 1000, 750, 900, 700};
		double min = array[0];
        for ( int i=0; i<array.length; i++) {
            if (array[i]<min) {
                 min = array[i];
            }
        }
        System.out.println("Trumpiausias atstumas " + min);
    }
	
}

