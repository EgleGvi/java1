package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Uzduotis6puodeliai {

	public Uzduotis6puodeliai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cups();
		//cookies();
		//parachute();
		//frog();
		//math();
		//buns();
		//jonukas();
		konkursas();
		
	}
	
	
	public static void cups() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kiek puodeliu reikia supakuoti?");
		int cup = scanner.nextInt();
		int box = cup / 3;
		System.out.println("Pilnu dezuciu skaicius: " + box);
		int residual = cup%3;
		System.out.println("Nesupakuotu puodeliu skaicius: " + residual);
	}
	
	public static void cookies() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kiek sausainiu iskepe Tautvydas?");
		int cookies = scanner.nextInt();
		System.out.println("Kiek draugu atsinese sausainiu?");
		int friendsCookies = scanner.nextInt();
		int sum = (cookies * friendsCookies)+cookies;
		System.out.println("Is visos sausainiu yra: " + sum);
		System.out.println("Kiek zmoniu is viso dalyvavo sventeje? ");
		int people = scanner.nextInt();
		int cookiesForPerson = sum / people;
		System.out.println("Kiekvienas sventes dalyvis gavo po " + cookiesForPerson + " sausainius");
		System.out.println("liko " + sum % people + " sausainiai");
	}
	
	public static void parachute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is kokio aukscio soka parasiutininkas?");
		double height = scanner.nextDouble();
		System.out.println("Per kiek sekundziu issiskleidzia parasiutas?");
		double sec = scanner.nextDouble();
		double parachuteTime = Math.sqrt((2 * height)/9.8);
		System.out.println(parachuteTime);
		if(sec < parachuteTime){
			System.out.println("Parasiutas issiskleis");
		}
		else {
			System.out.println("Parasiutas neissiskleis");
		}
	}
	
	public static void frog() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kiek sveria varle?");
		double weight = scanner.nextDouble();
		System.out.println("Kiek varliu norima stebeti?");
		double number = scanner.nextDouble();
		double sum = weight * number;
		System.out.println(sum);
		if(sum > 5000){
			System.out.println("Varliu stebejimui pakanka");
		}
		else {
			System.out.println("Varliu stebejimui per mazai");
		}
	}
	
	public static void math() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite pazymi");
		double grade1 = scanner.nextDouble();
		double grade2 = scanner.nextDouble();
		double grade3 = scanner.nextDouble();
		double grade4 = scanner.nextDouble();
		double grade5 = scanner.nextDouble();
		double gradeNumber = 5;
		double average = (grade1 + grade2 + grade3 + grade4 + grade5) / gradeNumber;
		System.out.println(average);
		if (average > 9) {
			System.out.println("Petriukas gaus tris saldainius");
		}
		else if (average >= 7 || average <= 9) {
			System.out.println("Petriukas gaus du saldainius");
		}
		else {
			System.out.println("Petriukas gaus viena saldaini");
		}
	}
	
	public static void buns() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite kainas a ir b:");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		System.out.println("Iveskite kiekius n1, n2, n3:");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		System.out.println("Iveskite bandeles kaina:");
		double k = scanner.nextDouble();
		double sum = 0;
		if(k <= a ) {
			sum=k * n1;		
		}
		else if(k > a &&  k < b) {
			sum = k * n2;
		}
		else if(k >= b) {
			sum= k * n3;
		}
		
		 sum = sum * 100;
		 sum = Math.round(sum);
		 sum = sum / 100; 
		 System.out.println("Uz bandeles bus sumoketa " + sum + " Lt");
	}
	
	public static void jonukas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite uzduoties varianta:");
		double num = scanner.nextDouble();
		if(num == 1 || num == 2 || num == 3) {
			System.out.println("Iveskite a reiksme");
			double a = scanner.nextDouble();
			System.out.println("Iveskite b reiksme");
			double b = scanner.nextDouble();
			double x = 0;
			if(num == 1) {
				x = (a * b) + 3;
			}
			else if(num == 2) {
				x = a + b;
			}
			else if(num == 3) {
				x = a - b;
			}
			System.out.println("Atsakymas x = " + x);
		}
		else {
			System.out.println("Tokio pasirinkimo nera");
		}
		
	}
	
	private static void konkursas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite intervalo pradzia:");
		int a = scanner.nextInt();
		System.out.println("Iveskite intervalo pabaiga:");
		int b = scanner.nextInt();
		int sum = 0;
		for(int i = a; i <= b; i++) {
			if(i % 6 == 0) {
				System.out.println(i);
				sum++;
			}
		}
		
		System.out.println("Reikalingu marskineliu skaicius: " + sum );
	}
	
	
}
