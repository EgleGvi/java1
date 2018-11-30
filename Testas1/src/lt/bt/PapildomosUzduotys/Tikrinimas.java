package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Tikrinimas {

	public Tikrinimas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimetras();
	}
	public static double Perimetras() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite apskritimo spinduli");
		double r = scanner.nextDouble();
		double sum = 2 * Math.PI * r;
		System.out.println(sum);
		return sum;
	}
}
