package lt.bt.AbstrakciosKlases;

import java.util.Scanner;

public class Apskritimas extends Figura {
	
	public Apskritimas() {
		// TODO Auto-generated constructor stub
	}
	
	
	public double Perimetras() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite apskritimo spinduli");
		double r = scanner.nextDouble();
		double sum = 2 * Math.PI * r;
		return sum;
	}
	

	public double Plotas() {
		double r = 0;
		double area = Math.PI * Math.pow(r, 2);
		return area;
	}
	
}
