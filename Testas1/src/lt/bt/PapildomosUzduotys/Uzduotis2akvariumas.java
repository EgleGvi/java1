package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Uzduotis2akvariumas {

	public Uzduotis2akvariumas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fish();
	}
	
	private static void fish() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kiek zuvu gyvena akvariume? ");
		int a = scanner.nextInt();
		System.out.println("Kiek zuvu i akvariuma idedama kiekviena diena? ");
		int b = scanner.nextInt();
		System.out.println("Kiek dienu praejo? ");
		int c = scanner.nextInt();
		int result = (b * c) + a;
		System.out.println("Po " + c + " dienu akvariume bus " + result + " zuvu");
	}
}
