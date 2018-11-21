package lt.bt.Testas;

import java.util.Scanner;

public class Uzduotis5 {

	public Uzduotis5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uzduotis();
	}

	public static void uzduotis() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("iveskite skaiciu: ");
		int pick = scanner.nextInt();
		int[] array = {3, 4, 5, 7, 4, 22, 11, 3, 5, 6, 6};
		int a = 0;
		for(int i=0; i <= array.length-1; i++) {
			if(pick == array[i]) {
				a++;
			}
		}
		System.out.println("Skaicius "+ pick + " pasikartoja " + a + " kart.");
			
	}
}

