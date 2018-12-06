package lt.bt.Testas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		skaitymas();
	}

	public static void skaitymas() throws IOException {
		String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\txt\\padangos.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		int height = scanner.nextInt(); //185
		int width = scanner.nextInt(); //65
		String wheels = scanner.next(); //String HR13
		
        
       Padangos padangos = new Padangos();
       padangos.setHeight(height);
       padangos.setWidth(width);
       padangos.setWheels(wheels);
       int arrayLength = scanner.nextInt();
       Padangos[] padangos1 = new Padangos[arrayLength];
       for (int i = 0; i <arrayLength; i++) {
    	   Padangos padangosSandelyje = new Padangos();
    	   height = scanner.nextInt(); //185
   		   width = scanner.nextInt(); //65
   		   wheels = scanner.next(); //String HR13
    	   padangosSandelyje.setHeight(height);
    	   padangosSandelyje.setWidth(width);
    	   padangosSandelyje.setWheels(wheels);
    	   padangosSandelyje.setPrice(scanner.nextDouble());
           padangos1[i] = padangosSandelyje;
           System.out.println(padangosSandelyje);
       }
       scanner.close(); 
	}
}

