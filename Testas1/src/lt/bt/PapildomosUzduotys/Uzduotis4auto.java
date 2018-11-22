package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Uzduotis4auto {

	public Uzduotis4auto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		auto();
	}
	
	public static void auto() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Koks automobilio greitis? ");
		int speed = scanner.nextInt();
		double road = 0.264;
		double time = speed * road;
		System.out.println(time);
	}
}
