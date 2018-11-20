package lt.bt.Testas;

public class Iki100do {

	public static void main(String[] args){
		doWhile();
    }
	public static void doWhile() {
	int count = 1;
	do {
	    System.out.print(count + " ");
	    count++;
	} while (count <= 100);
}
}