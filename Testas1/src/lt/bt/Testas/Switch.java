package lt.bt.Testas;

import java.util.Scanner;

public class Switch {

	public Switch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite skaiciu:");
		int number = scanner.nextInt();
	        String numberToWord; 
	  
	        switch (number) { 
	        case 1: 
	        	numberToWord = "Vienas"; 
	            break; 
	        case 2: 
	        	numberToWord = "Du"; 
	            break; 
	        case 3: 
	        	numberToWord = "Trys"; 
	            break; 
	        case 4: 
	        	numberToWord = "Keturi"; 
	            break; 
	        case 5: 
	        	numberToWord = "Penki"; 
	            break; 
	        case 6: 
	        	numberToWord = "Sesi"; 
	            break; 
	        case 7: 
	        	numberToWord = "Septyni"; 
	            break; 
	        default: 
	        	numberToWord = "Invalid number"; 
	            break; 
	        } 
	        System.out.println(numberToWord);
	        scanner.close();
	}
}
