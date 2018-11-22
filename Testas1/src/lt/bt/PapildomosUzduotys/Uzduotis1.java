package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Uzduotis1 {

	public Uzduotis1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pamokos2();
		//pamokos();
	}
	private static void pamokos() {
		// TODO Auto-generated method stub
		int monday = 5;
		int tuesday = 6;
		int wednesday = 4;
		int thursday = 5;
		int friday = 4;
		int time = 45;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite:");
		int number = scanner.nextInt();
		int sum = (monday  + tuesday + wednesday + thursday + friday);
		System.out.println(sum);
		int lessonTime = sum * time;
		System.out.println(lessonTime);
	}

    private static void pamokos2() {
     
	   double pamokosDouble = 0;
	   double minutesDouble = 45;
	    
      Scanner scanner = new Scanner(System.in);
      System.out.println("Pirmadienio pamokos:");
      int pirmadienis = scanner.nextInt();
      System.out.println("Antradienio pamokos:");
      int antradienis = scanner.nextInt();
      System.out.println("Treciadienio pamokos:");
      int treciadienis = scanner.nextInt();
      System.out.println("Ketvirtadienio pamokos:");
      int ketvirtadienis = scanner.nextInt();
      System.out.println("Penktadienio pamokos:");
      int penktadienis = scanner.nextInt();
      pamokosDouble = pirmadienis + antradienis + treciadienis + ketvirtadienis + penktadienis;
      double visoDouble = pamokosDouble * minutesDouble;
      System.out.println(visoDouble);
    }
}

