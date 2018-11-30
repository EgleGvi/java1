package lt.bt.PapildomosUzduotys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kontrolinis {

	public Kontrolinis() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double[] array = skaitymas();
		double suma = suma(array);
		double max = ilgiausias(array);
		double min = trumpiausias(array);
		rasymas(suma, min, max);
		System.out.println("Done");
		
	}
	
	public static double[] skaitymas() throws IOException {
		String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\src\\lt\\bt\\Kontrolinis\\txt\\DuomenysA.txt";
        File file = new File(filePath);
        if(!file.exists()) {
        	throw new IOException("File not found");
        }
        
        Scanner scanner = new Scanner(file);
        double[] array = new double [scanner.nextInt()];
        for(int i=0; i <array.length; i++) {
        	array[i] = scanner.nextDouble();
        }
        
        scanner.close();
        return array;
	}

	public static double suma(double[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
		 sum = sum + arr[i];
		}
		return sum;
	}
	
	public static double ilgiausias(double[] array) {
		double max = array[0];
		for ( int i=1; i<array.length; i++) {
            if (array[i]>max) {
                 max = array[i];
            }	
		}
		return max;	
	}	
	
	public static double trumpiausias(double[] array) {
		double min = array[0];
		for ( int i=1; i<array.length; i++) {
            if (array[i]<min) {
                 min = array[i];
            }	
		}
		return min;	
	}	
	
	public static void rasymas(double ilgis, double trump, double ilg) throws IOException {
		String fileName = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\src\\lt\\bt\\Kontrolinis\\txt\\result.txt";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
    	bw.write("Troleibuso marsruto ilgis yra " + ilgis);
		bw.newLine();
		bw.write("Trumpiausio marsruto atstumas yra " + trump);
		bw.newLine();
		bw.write("Ilgiausio marsruto atstumas yra " + ilg);
		bw.newLine();
		bw.close();
		fw.close();
	}
}
