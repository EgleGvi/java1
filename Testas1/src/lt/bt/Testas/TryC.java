package lt.bt.Testas;

public class TryC {

	public TryC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printText("Iveskite failo kelia");
	}
	
	public static void printText(String text) {
	    System.out.println(text);
	    
	}

	public static void ReadFromFile() {
		String filePath = "C:\\Users\\PC\\Desktop\\java\\java1\\Testas1\\res\\txt\\Tekstas.txt";
        File file = new File(filePath);
        if(file.exists()) {
            System.out.println("Failas yra");
        }
        else {
            System.out.println("Failo nera");
        }
	    
	}
}
