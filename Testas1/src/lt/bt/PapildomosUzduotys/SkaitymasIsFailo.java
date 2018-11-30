package lt.bt.PapildomosUzduotys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SkaitymasIsFailo {

	
	
	public SkaitymasIsFailo() {
		// TODO Auto-generated constructor stub
	}
	
    public static void main(String[] args) throws IOException {
    	bendrabutis();
    }
    
    public static void bendrabutis() throws IOException{
    	String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\txt\\failas.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int i;
        double[] array = new double [7];
        for(i=0; i < 7; i++) {
        	array[i] = scanner.nextDouble();
        	//System.out.println(array[i]);
        }
        
        
        
        String fileName = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\txt\\result.txt";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		double sum;
    	for(i=2; i < 7; i++) {
			sum = 0.5 * array[i];
			bw.write(sum + "Lt");
			bw.newLine();
    	}
		
		System.out.println("Done");
		bw.close();
		fw.close();
		scanner.close();
    }
    
   
}
