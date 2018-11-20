package lt.bt.Testas;

import java.io.Reader;
import java.util.Scanner;

import javax.print.DocFlavor.READER;

public class skaiciuotuvas {
	
	private static boolean continueProgramme = true;
	
	public skaiciuotuvas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		while (continueProgramme) {
			displayMenu();
        }
	}
	
	public static void displayMenu() {
		System.out.println("Pasirinkite veiksma: ");
		System.out.println("[1]-sudetis");
		System.out.println("[2]-daugyba");
		System.out.println("[3]-dalyba");
		System.out.println("[4]-atimtis");
		System.out.println("[5]-baigti darba");
		Scanner scanner = new Scanner(System.in);
		int pick = scanner.nextInt();
		switch (pick) { 
        case 1: 
        	sum();
            break; 
        case 2: 
        	multiplication(); 
            break; 
        case 3: 
        	division();
            break; 
        case 4: 
        	minus();
            break; 
        case 5: 
        	continueProgramme = false;
            break; 
        default: 
        	System.out.println("Tokio pasirinkimo nera");
            break; 
        } 
	}
	
	public static void sum() {
		System.out.println("Iveskite skaicius, kuriuos norite sudeti: ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double sum = a+b;
		System.out.println("Atsakymas: "+ sum);
	}
	
	public static void multiplication() {
		System.out.println("Iveskite skaicius, kuriuos norite sudauginti: ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double result = a*b*c;
		System.out.println("Atsakymas: "+ result);
	}
	
	public static void division() {
		System.out.println("Iveskite skaicius, kuriuos norite padalinti: ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double division = a/b;
		System.out.println("Atsakymas: "+ division);
	}
	
	public static void minus() {
		System.out.println("Iveskite skaicius, kuriuos norite atimti: ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double minus = a-b;
		System.out.println("Atsakymas: "+ minus);
	}
}
