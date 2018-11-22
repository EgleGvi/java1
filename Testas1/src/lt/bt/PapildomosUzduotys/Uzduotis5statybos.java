package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Uzduotis5statybos {

	public Uzduotis5statybos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		statybos();
	}
	public static void statybos() {
		// TODO Auto-generated method stub
		double brickH = 0.1;
		double brickL = 0.2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sienos ilgis: ");
		int length = scanner.nextInt();
		System.out.println("Sienos aukstis: ");
		int height = scanner.nextInt();
		System.out.println("Plytos kaina: ");
		double price = scanner.nextDouble();
		double wallArea = length * height;
		System.out.println("Sienos plotas: " + wallArea);
		double brickArea = brickH * brickL;
		System.out.println("Plytos plotas: " + brickArea);
		double brickNum = wallArea / brickArea;
		System.out.println("Plytu kiekis: " + Math.round(brickNum));
		double sum = brickNum * price;
		System.out.println("Plytu kaina: " + Math.round(sum));
	}
}
