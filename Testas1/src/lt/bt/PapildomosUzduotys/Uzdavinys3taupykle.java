package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Uzdavinys3taupykle {

	public Uzdavinys3taupykle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taupykle();
	}

	public static void taupykle() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kiek monetu po 5 ct? ");
		int a = scanner.nextInt();
		System.out.println("Kiek monetu po 20 ct? ");
		int b = scanner.nextInt();
		System.out.println("Kiek monetu po 2 lt? ");
		int c = scanner.nextInt();
		double sum = (a * 0.05)+ (b*0.20)+(c*2);
		System.out.println("Taupykleje yra " + sum + " lt");
	}
}
