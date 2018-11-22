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
		parachute();
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
}
