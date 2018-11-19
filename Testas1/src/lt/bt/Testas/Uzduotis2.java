package lt.bt.Testas;

import java.util.Scanner;

public class Uzduotis2 {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Iveskite gimimo metus:");
	        double birthDate = scanner.nextDouble();
	        System.out.println("Iveskite dabartinius metus:");
	        double todayData = scanner.nextDouble();
	        double age = todayData-birthDate;
	        System.out.println("Amzius:"+age);
	        scanner.close();
	   }
	
	}


