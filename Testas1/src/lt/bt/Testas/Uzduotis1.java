package lt.bt.Testas;

import java.util.Scanner;

public class Uzduotis1 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
         //AreaTriangle();
         //AreaRectangle();
         //AreaCircle();
         QuadraticEquation();
         int suma = sudetis(5, 6);
 
    }
	
	public static void AreaTriangle() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite trikampio statines ilgi:");
        double length = scanner.nextDouble();
        double area = (length * length) / 2;
        System.out.println(area);
	}
	
	public static void AreaRectangle() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite ilgi:");
        double length = scanner.nextDouble();
        System.out.println("Iveskite ploti:");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println(area);
	}
	
	public static void AreaCircle() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite spindulio ilgi:");
        double r = scanner.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(area);
	}
	
	public static void QuadraticEquation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite a:");
		double a = scanner.nextDouble();
		System.out.println("Iveskite b:");
		double b = scanner.nextDouble();
		System.out.println("Iveskite c:");
		double c = scanner.nextDouble();
		if(a==0 || b==0 || c==0) {
			System.out.println("a b c negali buti 0");
			return;
		}
		double d = Math.pow(b, 2) - 4 * a * c;
		double x;
		if(d > 0) {
			x = (b*(-1) + Math.sqrt(d))/2*a;
		}
		else if(d==0) {
			x = (b / 2*a)*-1;
		}
		else {
			System.out.println("Lygtis neturi sprendiniu");
			return;
		}
		
		System.out.println("Atsakymas: "+x);
	}
	
	
	private static int sudetis(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
