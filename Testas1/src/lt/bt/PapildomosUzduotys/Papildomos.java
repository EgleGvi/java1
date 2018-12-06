package lt.bt.PapildomosUzduotys;

import java.util.Scanner;

public class Papildomos {

	public Papildomos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//degalai();
		//kurjeris();
		//karnavalas();
		cards();
	}

	public static void degalai() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite kuro bako talpa");
		int t = scanner.nextInt();
		System.out.println("Iveskite kuro sanaudas n");
		int n = scanner.nextInt();
		double fuelOnOdd = 2 * n;
		double fuelOnEven = n;
		double fuelUsed = 0;
		int i = 0;
        while (fuelUsed < t) {
            if(i % 2 == 0) {
            	fuelUsed = fuelUsed+fuelOnEven;
            }
            else {
            	fuelUsed = fuelUsed+fuelOnOdd;
            }
        	i++;
        }
        System.out.println(i);
	}
	
	public static void kurjeris() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite suma: ");
		int readNumber = scanner.nextInt();
		int number = 0;
		if(readNumber > 100) {
		        number = 1;
		}
		int allNumber = 1;
		int sum=readNumber;
		while(readNumber > 0) {
			readNumber = scanner.nextInt();
			if(readNumber > 100) {
				number = number+1;
			}
			else if(readNumber == 0) {
			 break;
			}
			allNumber = allNumber +1;
			sum= sum + readNumber;
		}
		
		System.out.println(number);
		System.out.println(sum/allNumber);
		System.out.println(allNumber);
	}
	
	public static void karnavalas() {
		int people=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite kiek balu gavo mokinys:");
		int grade = -1;
		int inside=0;
		while(grade !=0) {
			grade = scanner.nextInt();
			if(grade == 0) {
				break;
			}
			if(grade > 10 || grade < 0) {
				System.out.println("Tokio balo nera");
				continue;
			}
			if(grade >= 5) {
				inside++;
			}
			people++;
		}
		System.out.println("I karnavala ejo " + people + " mokiniai/iu, pateko " + inside);	
	}
	
	public static void cards() {
		int cards=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Keliems draugams Linas nori dovanoti atvirukus?");
		int friendNum = scanner.nextInt();
		System.out.println("Kiek rusiu atviruku yra parduotuveje?");
		int cardsType = scanner.nextInt();
		int[] array = new int [cardsType];
		for(int i=0; i < array.length; i++) {
			int number = i+1;
			System.out.println("Kiek yra " + number + "-os rusies atviruku?");
			int type = scanner.nextInt();
			if(friendNum < type) {
				cards++;
			}
		}
		System.out.println(cards + " rusiu atviruku uzteks visiems Lino draugams.");
	}
}